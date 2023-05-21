
public class PerfectBinarySearchTest {
    @Test
    public void testBinarySearch() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 5;
        int expectedIndex = 2;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchNotFound() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 4;
        int expectedIndex = -1;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchEmptyArray() {
        int[] arr = {};
        int target = 5;
        int expectedIndex = -1;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchSingleElementArray() {
        int[] arr = {5};
        int target = 5;
        int expectedIndex = 0;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchLargeArray() {
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int target = 500000;
        int expectedIndex = 500000;
        int actualIndex = PerfectBinarySearch.binarySearch(arr, target);
        Assert.assertEquals(expectedIndex, actualIndex);
    }
}