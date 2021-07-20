import javax.xml.namespace.QName;

public class Cat extends Animal {

   public Cat(int maxRun) {
       super(maxRun, Integer.MIN_VALUE);
    }
        @Override
        public void swim(int Distance) {
        System.out.println("Кошка не умеет плавать\n");
    }
}
