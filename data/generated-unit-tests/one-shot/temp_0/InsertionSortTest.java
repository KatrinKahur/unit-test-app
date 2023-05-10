
public class InsertionSortTest {
    @Test
    public void testSort() {
        Integer[] array = {5, 2, 4, 6, 1, 3};
        InsertionSort insertionSort = new InsertionSort();
        Integer[] sortedArray = insertionSort.sort(array);
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6}, sortedArray);
    }

    @Test
    public void testSortWithRange() {
        Integer[] array = {5, 2, 4, 6, 1, 3};
        InsertionSort insertionSort = new InsertionSort();
        Integer[] sortedArray = insertionSort.sort(array, 2, 5);
        Assert.assertArrayEquals(new Integer[]{5, 2, 1, 4, 6, 3}, sortedArray);
    }

    @Test
    public void testSentinelSort() {
        Integer[] array = {5, 2, 4, 6, 1, 3};
        InsertionSort insertionSort = new InsertionSort();
        Integer[] sortedArray = insertionSort.sentinelSort(array);
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6}, sortedArray);
    }

    @Test
    public void testMeasureApproxExecTime() {
        Double[] array = {5.0, 2.0, 4.0, 6.0, 1.0, 3.0};
        InsertionSort insertionSort = new InsertionSort();
        double execTime = insertionSort.measureApproxExecTime(insertionSort::sort, array);
        Assert.assertTrue(execTime > 0);
    }
}