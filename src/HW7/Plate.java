package HW7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (!hasEnough(appetite)) {
            System.out.println("Аппетиты больше");
        }
        else {
            food = food - appetite;
        }
    }

    public boolean hasEnough(int appetite) { return appetite < food; }

    public void increaseFood(int countFood) { food += countFood; }

}
