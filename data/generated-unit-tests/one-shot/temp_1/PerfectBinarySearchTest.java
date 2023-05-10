
public class PerfectBinarySearchTest {
    @Test
    public void testBinarySearchReturnsCorrectIndex() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 5;
        int expectedIndex = 2;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchReturnsNegativeOneWhenTargetNotFound() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 4;
        int expectedIndex = -1;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchReturnsCorrectIndexWhenTargetIsFirstElement() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 1;
        int expectedIndex = 0;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchReturnsCorrectIndexWhenTargetIsLastElement() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 9;
        int expectedIndex = 4;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchReturnsNegativeOneWhenArrayIsEmpty() {
        int[] arr = {};
        int target = 5;
        int expectedIndex = -1;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        Assert.assertEquals(expectedIndex, actualIndex);
    }
}