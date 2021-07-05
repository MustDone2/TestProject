public class Main {
        public static void main(String[] args){
            int P = CountP();
            System.out.println(P);
            System.out.println((P >= 10)&&(P <= 20));

            printNumber(5);
            boolean step = compareNumbers();
            System.out.println(step);

            printMessage(3,"Hello World!");


        }

        public static int CountP() {
            int a = 10;
            int b = 5;

            return (a+b);
        }

        public static void  printNumber(int number) {
            if (number >= 0) {
                System.out.println("Положительное число");
            } else if (number < 0) {
                System.out.println("Отрицательное число");
            } else {
                System.out.println("Другое число");
            }
        }

        public static boolean compareNumbers() {
            int x = -15;
            return (x < 0);
        }

        public static void printMessage(int count, String message) {
            int counter = 0;
            while (counter < count) {
                System.out.println(message);
                counter++;
            }
        }
    }


