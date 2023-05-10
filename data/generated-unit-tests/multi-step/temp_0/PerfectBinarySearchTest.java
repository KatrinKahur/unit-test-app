
package searches;

import org.junit.Test;
import static org.junit.Assert.*;

public class PerfectBinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 5;
        int expected = 2;
        int result = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchEmptyArray() {
        int[] arr = {};
        int target = 5;
        int expected = -1;
        int result = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchOneElementArray() {
        int[] arr = {5};
        int target = 5;
        int expected = 0;
        int result = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchTargetNotPresent() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 6;
        int expected = -1;
        int result = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchTargetLessThanFirstElement() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 0;
        int expected = -1;
        int result = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchTargetGreaterThanLastElement() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 10;
        int expected = -1;
        int result = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expected, result);
    }
}