package main.java.firsttask;

public class ArrayGenerator {

    public static int[] generateArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * array.length);
        }

        return array;
    }
}
