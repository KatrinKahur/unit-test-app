
package sorts;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class InsertionSortTest {

    @Test
    public void testSort() {
        Integer[] arr = {5, 2, 8, 3, 1};
        InsertionSort is = new InsertionSort();
        Integer[] sortedArr = is.sort(arr);
        Integer[] expectedArr = {1, 2, 3, 5, 8};
        assertArrayEquals(expectedArr, sortedArr);
    }

    @Test
    public void testSortEmptyArray() {
        Integer[] arr = {};
        InsertionSort is = new InsertionSort();
        Integer[] sortedArr = is.sort(arr);
        Integer[] expectedArr = {};
        assertArrayEquals(expectedArr, sortedArr);
    }

    @Test
    public void testSortSingleElementArray() {
        Integer[] arr = {5};
        InsertionSort is = new InsertionSort();
        Integer[] sortedArr = is.sort(arr);
        Integer[] expectedArr = {5};
        assertArrayEquals(expectedArr, sortedArr);
    }

    @Test
    public void testSortDuplicateElements() {
        Integer[] arr = {5, 2, 8, 3, 1, 2, 5};
        InsertionSort is = new InsertionSort();
        Integer[] sortedArr = is.sort(arr);
        Integer[] expectedArr = {1, 2, 2, 3, 5, 5, 8};
        assertArrayEquals(expectedArr, sortedArr);
    }

    @Test
    public void testSentinelSort() {
        Integer[] arr = {5, 2, 8, 3, 1};
        InsertionSort is = new InsertionSort();
        Integer[] sortedArr = is.sentinelSort(arr);
        Integer[] expectedArr = {1, 2, 3, 5, 8};
        assertArrayEquals(expectedArr, sortedArr);
    }

    @Test
    public void testSentinelSortEmptyArray() {
        Integer[] arr = {};
        InsertionSort is = new InsertionSort();
        Integer[] sortedArr = is.sentinelSort(arr);
        Integer[] expectedArr = {};
        assertArrayEquals(expectedArr, sortedArr);
    }

    @Test
    public void testSentinelSortSingleElementArray() {
        Integer[] arr = {5};
        InsertionSort is = new InsertionSort();
        Integer[] sortedArr = is.sentinelSort(arr);
        Integer[] expectedArr = {5};
        assertArrayEquals(expectedArr, sortedArr);
    }

    @Test
    public void testSentinelSortDuplicateElements() {
        Integer[] arr = {5, 2, 8, 3, 1, 2, 5};
        InsertionSort is = new InsertionSort();
        Integer[] sortedArr = is.sentinelSort(arr);
        Integer[] expectedArr = {1, 2, 2, 3, 5, 5, 8};
        assertArrayEquals(expectedArr, sortedArr);
    }

    @Test
    public void testMeasureApproxExecTime() {
        Double[] arr = {5.0, 2.0, 8.0, 3.0, 1.0};
        InsertionSort is = new InsertionSort();
        double time = is.measureApproxExecTime(is::sort, arr);
        assertTrue(time > 0);
    }
}