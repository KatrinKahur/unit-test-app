
package sorts;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testSort() {
        // Test sorting an array of integers
        Integer[] arr1 = {3, 7, 1, 9, 2};
        Integer[] sortedArr1 = {1, 2, 3, 7, 9};
        assertArrayEquals(sortedArr1, new BubbleSort().sort(arr1));

        // Test sorting an array of strings
        String[] arr2 = {"banana", "apple", "pear", "orange"};
        String[] sortedArr2 = {"apple", "banana", "orange", "pear"};
        assertArrayEquals(sortedArr2, new BubbleSort().sort(arr2));

        // Test sorting an array of doubles
        Double[] arr3 = {3.5, 1.2, 8.9, 4.1, 2.7};
        Double[] sortedArr3 = {1.2, 2.7, 3.5, 4.1, 8.9};
        assertArrayEquals(sortedArr3, new BubbleSort().sort(arr3));

        // Test sorting an array with duplicate elements
        Integer[] arr4 = {4, 2, 5, 2, 1, 4};
        Integer[] sortedArr4 = {1, 2, 2, 4, 4, 5};
        assertArrayEquals(sortedArr4, new BubbleSort().sort(arr4));

        // Test sorting an empty array
        Integer[] arr5 = {};
        Integer[] sortedArr5 = {};
        assertArrayEquals(sortedArr5, new BubbleSort().sort(arr5));

        // Test sorting an array with only one element
        Integer[] arr6 = {7};
        Integer[] sortedArr6 = {7};
        assertArrayEquals(sortedArr6, new BubbleSort().sort(arr6));
    }
}