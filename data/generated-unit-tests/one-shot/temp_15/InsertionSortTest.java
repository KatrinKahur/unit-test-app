
public class InsertionSortTest {

    @Test
    public void testSort() {
        Integer[] array = {5, 2, 8, 1, 3, 7};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(array);
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 5, 7, 8}, array);
    }

    @Test
    public void testSortWithBounds() {
        Integer[] array = {5, 2, 8, 1, 3, 7};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(array, 2, 5);
        Assert.assertArrayEquals(new Integer[]{5, 2, 1, 8, 3, 7}, array);
    }

    @Test
    public void testSentinelSort() {
        Integer[] array = {5, 2, 8, 1, 3, 7};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sentinelSort(array);
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 5, 7, 8}, array);
    }

    @Test
    public void testMeasureApproxExecTime() {
        Double[] array = {5.6, 2.8, 8.2, 1.1, 3.5, 7.7};
        double execTime = InsertionSort.measureApproxExecTime(InsertionSort::sort, array);
        Assert.assertTrue(execTime >= 0.0);
    }
}