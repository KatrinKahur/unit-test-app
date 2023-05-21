
import static org.junit.Assert.*;
import org.junit.Test;

public class PerfectBinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 5;
        int expectedIndex = 2;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchNotFound() {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 4;
        int expectedIndex = -1;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testBinarySearchEmptyArray() {
        int[] arr = {};
        int target = 5;
        PerfectBinarySearch.binarySearch(arr, target);
    }

    @Test
    public void testBinarySearchSingleElementArray() {
        int[] arr = {5};
        int target = 5;
        int expectedIndex = 0;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchMultipleMatchingElements() {
        int[] arr = {1, 3, 5, 5, 7, 9, 11};
        int target = 5;
        int expectedIndex = 2; // index of the first matching element
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchExtremeValues() {
        int[] arr = {Integer.MIN_VALUE, -1000, 0, 1000, Integer.MAX_VALUE};
        int target = Integer.MAX_VALUE;
        int expectedIndex = 4;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expectedIndex, actualIndex);
    }
}