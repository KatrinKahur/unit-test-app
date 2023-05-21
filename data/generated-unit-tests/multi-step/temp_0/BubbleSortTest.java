
package sorts;

import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void testSort() {
        // Test empty array
        Integer[] emptyArray = {};
        assertArrayEquals(emptyArray, new BubbleSort().sort(emptyArray));

        // Test array with one element
        Integer[] oneElementArray = {1};
        assertArrayEquals(oneElementArray, new BubbleSort().sort(oneElementArray));

        // Test array with duplicate elements
        Integer[] duplicateArray = {3, 2, 1, 2, 3};
        Integer[] sortedDuplicateArray = {1, 2, 2, 3, 3};
        assertArrayEquals(sortedDuplicateArray, new BubbleSort().sort(duplicateArray));

        // Test already sorted array
        Integer[] sortedArray = {1, 2, 3, 4, 5};
        assertArrayEquals(sortedArray, new BubbleSort().sort(sortedArray));

        // Test unsorted array
        Integer[] unsortedArray = {5, 4, 3, 2, 1};
        Integer[] sortedUnsortedArray = {1, 2, 3, 4, 5};
        assertArrayEquals(sortedUnsortedArray, new BubbleSort().sort(unsortedArray));
    }
}