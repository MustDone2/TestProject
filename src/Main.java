public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(200);
        Dog dog = new Dog(500, 10);

        cat.run(150);
        cat.swim(5);

        dog.run(500);
        dog.swim(9);
    }
}
