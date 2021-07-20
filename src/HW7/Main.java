package HW7;

public class Main {
   public static void main(String[] args) {
       Cat[] cats = {
                new Cat("Барсик", 15),
                new Cat("Муся", 20),
                new Cat("Уся", 30)
        };

        Plate plate = new Plate(20);

        for (Cat cat : cats) {
            cat.eat(plate);
        }
        plate.increaseFood(50);
        for (Cat cat : cats) {
            cat.eat(plate);
        }
    }
}
