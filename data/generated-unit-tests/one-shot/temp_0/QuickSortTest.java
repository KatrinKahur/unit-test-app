
public class QuickSortTest {
    @Test
    public void testSort() {
        Integer[] arr = {5, 2, 9, 1, 5, 6};
        QuickSort quickSort = new QuickSort();
        Integer[] sortedArr = quickSort.sort(arr);
        Assert.assertArrayEquals(new Integer[]{1, 2, 5, 5, 6, 9}, sortedArr);
    }

    @Test
    public void testRandomPartition() {
        Integer[] arr = {5, 2, 9, 1, 5, 6};
        int partitionIndex = QuickSort.randomPartition(arr, 0, arr.length - 1);
        Assert.assertTrue(partitionIndex >= 0 && partitionIndex < arr.length);
    }

    @Test
    public void testPartition() {
        Integer[] arr = {5, 2, 9, 1, 5, 6};
        int partitionIndex = QuickSort.partition(arr, 0, arr.length - 1);
        Assert.assertTrue(partitionIndex >= 0 && partitionIndex < arr.length);
    }
}