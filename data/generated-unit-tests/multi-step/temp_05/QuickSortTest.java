
package sorts;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void testSort() {
        QuickSort quickSort = new QuickSort();

        // Test empty array
        Integer[] emptyArray = new Integer[0];
        Integer[] expectedEmptyArray = new Integer[0];
        assertArrayEquals(expectedEmptyArray, quickSort.sort(emptyArray));

        // Test array with one element
        Integer[] oneElementArray = {1};
        Integer[] expectedOneElementArray = {1};
        assertArrayEquals(expectedOneElementArray, quickSort.sort(oneElementArray));

        // Test array with duplicate elements
        Integer[] duplicateArray = {4, 2, 5, 2, 1};
        Integer[] expectedDuplicateArray = {1, 2, 2, 4, 5};
        assertArrayEquals(expectedDuplicateArray, quickSort.sort(duplicateArray));

        // Test already sorted array
        Integer[] sortedArray = {1, 2, 3, 4, 5};
        Integer[] expectedSortedArray = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedSortedArray, quickSort.sort(sortedArray));

        // Test partially sorted array
        Integer[] partiallySortedArray = {3, 1, 2, 4, 5};
        Integer[] expectedPartiallySortedArray = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedPartiallySortedArray, quickSort.sort(partiallySortedArray));

        // Test array with negative elements
        Integer[] negativeArray = {-4, 2, -5, 0, 1};
        Integer[] expectedNegativeArray = {-5, -4, 0, 1, 2};
        assertArrayEquals(expectedNegativeArray, quickSort.sort(negativeArray));
    }
}