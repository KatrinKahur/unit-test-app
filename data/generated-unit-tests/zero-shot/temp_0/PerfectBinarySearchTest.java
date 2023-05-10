
import org.junit.Test;
import static org.junit.Assert.*;

public class PerfectBinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int expected = 4;
        int result = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchNotFound() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 11;
        int expected = -1;
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
    public void testBinarySearchSingleElementArray() {
        int[] arr = {5};
        int target = 5;
        int expected = 0;
        int result = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchNegativeNumbers() {
        int[] arr = {-10, -5, 0, 5, 10};
        int target = -5;
        int expected = 1;
        int result = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expected, result);
    }
}