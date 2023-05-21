
public class InsertionSortTest {

    @Test
    public void testSort() {
        Integer[] array = {5, 2, 9, 1, 5, 6};
        InsertionSort insertionSort = new InsertionSort();
        Integer[] sortedArray = insertionSort.sort(array);
        Arrays.sort(array);
        Assert.assertArrayEquals(array, sortedArray);
    }

    @Test
    public void testSortWithRange() {
        Integer[] array = {5, 2, 9, 1, 5, 6};
        InsertionSort insertionSort = new InsertionSort();
        Integer[] sortedArray = insertionSort.sort(array, 2, 5);
        Integer[] expectedArray = {5, 2, 1, 9, 5, 6};
        Arrays.sort(expectedArray, 2, 5);
        Assert.assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void testSentinelSort() {
        Integer[] array = {5, 2, 9, 1, 5, 6};
        InsertionSort insertionSort = new InsertionSort();
        Integer[] sortedArray = insertionSort.sentinelSort(array);
        Arrays.sort(array);
        Assert.assertArrayEquals(array, sortedArray);
    }

    @Test
    public void testMeasureApproxExecTime() {
        Double[] array = new Double[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        InsertionSort insertionSort = new InsertionSort();
        double time = insertionSort.measureApproxExecTime(insertionSort::sort, array);
        Assert.assertTrue(time > 0);
    }
}