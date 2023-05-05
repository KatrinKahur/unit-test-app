package sorts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {

    @Test
    void testSort() {
        // Test sorting an already sorted array
        Integer[] arr = {1, 2, 3, 4, 5};
        InsertionSort insertionSort = new InsertionSort();
        Integer[] sortedArr = insertionSort.sort(arr);
        assertArrayEquals(sortedArr, arr);

        // Test sorting an array in reverse order
        arr = new Integer[]{5, 4, 3, 2, 1};
        sortedArr = insertionSort.sort(arr);
        Arrays.sort(arr);
        assertArrayEquals(sortedArr, arr);

        // Test sorting an array with repeated elements
        arr = new Integer[]{4, 2, 3, 1, 4};
        sortedArr = insertionSort.sort(arr);
        Arrays.sort(arr);
        assertArrayEquals(sortedArr, arr);

        // Test sorting an array of strings
        String[] stringArr = {"banana", "apple", "pear", "orange"};
        String[] sortedStringArr = {"apple", "banana", "orange", "pear"};
        InsertionSort stringInsertionSort = new InsertionSort();
        assertArrayEquals(sortedStringArr, stringInsertionSort.sort(stringArr));
    }

    @Test
    void testSentinelSort() {
        // Test sorting an already sorted array
        Integer[] arr = {1, 2, 3, 4, 5};
        InsertionSort insertionSort = new InsertionSort();
        Integer[] sortedArr = insertionSort.sentinelSort(arr);
        assertArrayEquals(sortedArr, arr);

        // Test sorting an array in reverse order
        arr = new Integer[]{5, 4, 3, 2, 1};
        sortedArr = insertionSort.sentinelSort(arr);
        Arrays.sort(arr);
        assertArrayEquals(sortedArr, arr);

        // Test sorting an array with repeated elements
        arr = new Integer[]{4, 2, 3, 1, 4};
        sortedArr = insertionSort.sentinelSort(arr);
        Arrays.sort(arr);
        assertArrayEquals(sortedArr, arr);

        // Test sorting an array of strings
        String[] stringArr = {"banana", "apple", "pear", "orange"};
        String[] sortedStringArr = {"apple", "banana", "orange", "pear"};
        InsertionSort stringInsertionSort = new InsertionSort();
        assertArrayEquals(sortedStringArr, stringInsertionSort.sentinelSort(stringArr));
    }

    /**@Test
    void testMeasureApproxExecTime() {
        // Test measuring the execution time of sorting a small array
        InsertionSort insertionSort = new InsertionSort();
        Double[] arr = {1.0, 2.0, 3.0};
        Double[] sortedArr = insertionSort.sort(arr);
        Double[] expectedArr = {1.0, 2.0, 3.0};
        assertArrayEquals(sortedArr, expectedArr);
        double execTime = insertionSort.measureApproxExecTime(insertionSort::sort, arr);
        assertTrue(execTime < 0.1);

        // Test measuring the execution time of sorting a larger array
        int n = 10000;
        Double[] largeArr = new Double[n];
        for (int i = 0; i < n; i++) {
            largeArr[i] = Math.random();
        }
        sortedArr = insertionSort.sort(largeArr);
        Arrays.sort(largeArr);
        assertArrayEquals(sortedArr, largeArr);
        execTime = insertionSort.measureApproxExecTime(insertionSort::sort, largeArr);
        assertTrue(execTime < 5.0);
    }**/
}