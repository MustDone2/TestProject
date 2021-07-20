package HW7;

public class Cat {
    private boolean full;
    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
       this.name = name;
       this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.hasEnough(appetite) && !full) {
            System.out.println(name + " кушает");
            plate.decreaseFood(appetite);
            full = true;
        }
        else if (!plate.hasEnough(appetite)) {
            System.out.println(name + " недовольно рычит");
        }
        else if (full) {
            System.out.println(name + " поел");
        }
    }

    public void eatFrom(Plate plate) {
        plate.decreaseFood(appetite);
    }
}
