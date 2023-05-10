
import org.junit.Test;
import static org.junit.Assert.*;

public class PerfectBinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 7;
        int expectedIndex = 3;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchEmptyArray() {
        int[] arr = {};
        int target = 5;
        int expectedIndex = -1;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expectedIndex, actualIndex);
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
    public void testBinarySearchSingleElementArrayNotFound() {
        int[] arr = {5};
        int target = 3;
        int expectedIndex = -1;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchDuplicateElements() {
        int[] arr = {1, 3, 5, 5, 7, 9};
        int target = 5;
        int expectedIndex = 2;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        assertTrue(actualIndex == expectedIndex || actualIndex == 3);
    }
}