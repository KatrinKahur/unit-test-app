
public class QuickSortTest {

    @Test
    public void testSort() {
        Integer[] array = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array);
        Integer[] expected = {0, 1, 2, 4, 6, 9, 12, 23, 34};
        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void testRandomPartition() {
        Integer[] array = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        int partitionIndex = QuickSort.randomPartition(array, 0, array.length - 1);
        Assert.assertTrue(partitionIndex >= 0 && partitionIndex < array.length);
    }

    @Test
    public void testPartition() {
        Integer[] array = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        int partitionIndex = QuickSort.partition(array, 0, array.length - 1);
        Assert.assertTrue(partitionIndex >= 0 && partitionIndex < array.length);
    }
}