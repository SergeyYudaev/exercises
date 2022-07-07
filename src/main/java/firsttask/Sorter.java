package main.java.firsttask;

public class Sorter {

    public static int[] sort(int[] unsortedArray) {
        return doSort(unsortedArray, 0, unsortedArray.length - 1);
    }

    private static int[] doSort(int[] array, int left, int right) {
        if (left < right) {
            var separator = step(array, left, right);
            doSort(array, left, separator - 1);
            doSort(array, separator, right);
        }

        return array;
    }

    private static int step(int[] array, int left, int right) {
        var central = array[(left + right) / 2];

        while (left <= right) {
            while (array[left] < central) {
                left++;
            }
            while (array[right] > central) {
                right--;
            }

            if (left <= right) {
                var tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
                left++;
                right--;
            }
        }

        return left;
    }
}
