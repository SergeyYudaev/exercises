package main.java.firsttask;

import java.util.Arrays;

public class Main {

    private static final int ARRAY_LENGTH = 100;

    public static void main(String[] args) {
        var array = ArrayGenerator.generateArray(ARRAY_LENGTH);
        System.out.println(Arrays.toString(array));

        var sortedArray = Sorter.sort(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}
