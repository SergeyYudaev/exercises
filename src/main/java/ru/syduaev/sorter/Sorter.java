package ru.syduaev.sorter;

/**
 * Сортировщик массивов.
 */
public class Sorter {

    private static final SortDirection DEFAULT_SORT_DIRECTION = SortDirection.ASC;

    /**
     * Метод быстрой сортировки массива по возрастанию (алгоритм Тони Хоара).
     *
     * @param unsortedArray Исходный массив.
     * @return Отсортированный массив.
     */
    public static int[] sort(int[] unsortedArray) {
        return sort(unsortedArray, DEFAULT_SORT_DIRECTION);
    }

    /**
     * Метод быстрой сортировки массива (алгоритм Тони Хоара).
     *
     * @param unsortedArray Исходный массив.
     * @param direction     {@link SortDirection направление сортировки}.
     * @return Отсортированный массив.
     */
    public static int[] sort(int[] unsortedArray, SortDirection direction) {
        return doSort(unsortedArray, 0, unsortedArray.length - 1, direction);
    }

    private static int[] doSort(int[] array, int left, int right, SortDirection direction) {
        if (left < right) {
            int separator = step(array, left, right, direction);
            doSort(array, left, separator - 1, direction);
            doSort(array, separator, right, direction);
        }

        return array;
    }

    private static int step(int[] array, int left, int right, SortDirection direction) {
        int central = array[(left + right) / 2];
        while (left <= right) {
            left = getLeft(array, left, central, direction);
            right = getRight(array, right, central, direction);

            if (left <= right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
                left++;
                right--;
            }
        }

        return left;
    }

    private static int getLeft(int[] array, int left, int central, SortDirection direction) {
        if (direction == SortDirection.ASC) {
            while (array[left] < central) {
                left++;
            }
        } else {
            while (array[left] > central) {
                left++;
            }
        }

        return left;
    }

    private static int getRight(int[] array, int right, int central, SortDirection direction) {
        if (direction == SortDirection.ASC) {
            while (array[right] > central) {
                right--;
            }
        } else {
            while (array[right] < central) {
                right--;
            }
        }

        return right;
    }
}
