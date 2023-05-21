
package searches;

import org.junit.Test;
import static org.junit.Assert.*;

public class PerfectBinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 3;
        int expected = 1;
        int actual = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expected, actual);
    }

    @Test
    public void testBinarySearchNotFound() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 4;
        int expected = -1;
        int actual = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expected, actual);
    }

    @Test
    public void testBinarySearchFirstElement() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 1;
        int expected = 0;
        int actual = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expected, actual);
    }

    @Test
    public void testBinarySearchLastElement() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 9;
        int expected = 4;
        int actual = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expected, actual);
    }

    @Test
    public void testBinarySearchEmptyArray() {
        int[] arr = {};
        int target = 4;
        int expected = -1;
        int actual = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expected, actual);
    }

    @Test
    public void testBinarySearchSingleElement() {
        int[] arr = {4};
        int target = 4;
        int expected = 0;
        int actual = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expected, actual);
    }

    @Test
    public void testBinarySearchDuplicateElements() {
        int[] arr = {1, 3, 3, 5, 7, 9};
        int target = 3;
        int expected = 2;
        int actual = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expected, actual);
    }
}