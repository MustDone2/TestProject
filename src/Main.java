import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //task1
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array));
        changeZeroes(array);
        System.out.println(Arrays.toString(array));
        //task2
        int[] a = new int[100];
        fullArray(a);
        System.out.println(Arrays.toString(a));
        //task3
        int[] b = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        massive(b);
        System.out.println(Arrays.toString(b));
        //task4
        int[][] arr = new int[3][3];
        fullDiagonal(arr);
        //task5
        line(1, 555);
    }
        //Первое задание
    public static void changeZeroes(int[] inputArray) {
        for (int i = 0; i < inputArray.length; ++i) {
            inputArray[i] = inputArray[i] == 1 ? 0 : 1;
        }

    }
        //Второе задание
    public static void fullArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = i + 1;
        }
    }
        //Третье задание
    public static void massive(int[] mass) {
        for (int i = 0; i < mass.length; ++i) {
            mass[i] = (mass[i] < 6) ? (mass[i] * 2) : mass[i];
        }
    }
        //Четвертое задание
    public static void fullDiagonal(int[][] square) {
        for (int i = 0; i < square.length; ++i) {
            square[i][i] = 1;
            square[i][square.length - 1 - i] = 1;
            System.out.println(Arrays.toString(square[i]));
        }
    }
        //Пятое задание
    public static int line(int len, int initialValue) {
        int[] cat;
        cat = new int[len];
        for (int i = 0; i < cat.length; i++)
        {
            cat[i] = initialValue;
        }
        System.out.println(Arrays.toString(cat));
        return len;
    }
}






