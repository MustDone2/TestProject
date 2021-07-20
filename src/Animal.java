public abstract class Animal {
    private int maxRun;
    private int maxSwim;

    public Animal(int maxRun, int maxSwim) {
    this.maxRun = maxRun;
    this.maxSwim = maxSwim;
    }

    public void run(int Distance) {
        if (Distance > maxRun) {
            System.out.println("Не может пробежать " + Distance);
            System.out.println("Максимум " + maxRun);
        } else {
            System.out.println("Расстояние для бега " + Distance);
        }
        System.out.println();
    }

    public void swim( int Distance) {
        if (Distance > maxSwim) {
            System.out.println("Не может проплыть " + Distance);
            System.out.println("Максимум " + maxSwim);
        }
        else {
            System.out.println("Расстояние вплавь " + Distance);
        }
        System.out.println();
    }
}
