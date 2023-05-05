package searches;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PerfectBinarySearchTest {

    @Test
    void testBinarySearchReturnsCorrectIndex() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 4;
        int expectedIndex = 3;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        Assertions.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void testBinarySearchReturnsNegativeOneWhenTargetNotInArray() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 7;
        int expectedIndex = -1;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        Assertions.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void testBinarySearchReturnsNegativeOneWhenArrayIsEmpty() {
        int[] arr = {};
        int target = 1;
        int expectedIndex = -1;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        Assertions.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void testBinarySearchCanHandleDuplicates() {
        int[] arr = {1, 2, 3, 3, 4, 5, 6};
        int target = 3;
        int expectedIndex = 2;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        Assertions.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void testBinarySearchHandlesSingleElementArray() {
        int[] arr = {1};
        int target = 1;
        int expectedIndex = 0;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        Assertions.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void testBinarySearchHandlesOddLengthArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 2;
        int expectedIndex = 1;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        Assertions.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    void testBinarySearchHandlesEvenLengthArray() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 6;
        int expectedIndex = 5;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        Assertions.assertEquals(expectedIndex, actualIndex);
    }
}