
public class QuickSortTest {

    @Test
    public void testIntegerSort() {
        Integer[] unsortedArray = { 6, 2, 4, 1, 5, 9 };
        Integer[] sortedArray = { 1, 2, 4, 5, 6, 9 };

        QuickSort.quickSort(unsortedArray);

        Assert.assertEquals(Arrays.toString(sortedArray), Arrays.toString(unsortedArray));
    }

    @Test
    public void testStringSort() {
        String[] unsortedArray = { "banana", "apple", "pear", "grape", "orange", "lime" };
        String[] sortedArray = { "apple", "banana", "grape", "lime", "orange", "pear" };

        QuickSort.quickSort(unsortedArray);

        Assert.assertEquals(Arrays.toString(sortedArray), Arrays.toString(unsortedArray));
    }

    @Test
    public void testRandomPartitionIndex() {
        Integer[] array = { 4, 1, 6, 9, 2 };
        int randomIndex = QuickSort.randomPartition(array, 0, array.length -1);

        Assert.assertTrue(randomIndex >= 0 && randomIndex <= array.length - 1);
    }

    @Test
    public void testPartition() {
        Integer[] array = { 2, 8, 7, 1, 3, 5, 6, 4 };
        int pivotIndex = QuickSort.partition(array, 0, array.length - 1);

        Assert.assertEquals(3, pivotIndex);

        Integer[] edgesArray = { 8, 7, 2, 6, 5, 1 };
        int edgesPivotIndex = QuickSort.partition(edgesArray, 0, edgesArray.length - 1);
        Assert.assertEquals(3, edgesPivotIndex);
    }
}