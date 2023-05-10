
public class InsertionSortTest {
    private InsertionSort insertionSort = new InsertionSort();

    @Test
    public void testSort() {
        Integer[] array = {4, 2, 5, 1, 3};
        Integer[] sorted = insertionSort.sort(array);
        Integer[] expected = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, sorted);
    }

    @Test
    public void testSentinelSort() {
        Integer[] array = {4, 2, 5, 1, 3};
        Integer[] sorted = insertionSort.sentinelSort(array);
        Integer[] expected = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, sorted);
    }

    @Test
    public void testSortWithDuplicates() {
        Integer[] array = {4, 2, 5, 1, 3, 2};
        Integer[] sorted = insertionSort.sort(array);
        Integer[] expected = {1, 2, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, sorted);
    }

    @Test
    public void testSortWithEmptyArray() {
        Integer[] array = {};
        Integer[] sorted = insertionSort.sort(array);
        Integer[] expected = {};
        Assert.assertArrayEquals(expected, sorted);
    }

    @Test
    public void testSortWithOneElementArray() {
        Integer[] array = {1};
        Integer[] sorted = insertionSort.sort(array);
        Integer[] expected = {1};
        Assert.assertArrayEquals(expected, sorted);
    }

    @Test
    public void testSortWithAlreadySortedArray() {
        Integer[] array = {1, 2, 3, 4, 5};
        Integer[] sorted = insertionSort.sort(array);
        Integer[] expected = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, sorted);
    }
}