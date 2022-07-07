import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SorterTest {

    @Test
    void sortAsk() {
        var unsortedArray = generateArray(100);
        var sortedArray = Sorter.sort(unsortedArray, SortDirection.ASC);

        for (int i = 1; i < unsortedArray.length; i++) {
            assertTrue(sortedArray[i] >= sortedArray[i - 1]);
        }

        assertEquals(sortedArray.length, unsortedArray.length);
    }

    @Test
    void sortDesk() {
        var unsortedArray = generateArray(100);
        var sortedArray = Sorter.sort(unsortedArray, SortDirection.DESC);

        for (int i = 1; i < unsortedArray.length; i++) {
            assertTrue(sortedArray[i] <= sortedArray[i - 1]);
        }

        assertEquals(sortedArray.length, unsortedArray.length);
    }

    private int[] generateArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * array.length);
        }

        return array;
    }
}