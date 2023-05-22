
public class BubbleSortTest {

    @Test
    public void testSort() {
        Integer[] array = {5, 3, 4, 1, 2};
        SortAlgorithm<Integer> bubbleSort = new BubbleSort();
        Integer[] expected = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, bubbleSort.sort(array));
    }

    @Test
    public void testEmptyArray() {
        Integer[] array = {};
        SortAlgorithm<Integer> bubbleSort = new BubbleSort();
        Arrays.sort(array); // sorting to verify
        Integer[] expected = {};
        Assert.assertArrayEquals(expected, bubbleSort.sort(array));
    }

    @Test
    public void testAlreadySorted() {
        Integer[] array = {2, 4, 6, 8, 10};
        SortAlgorithm<Integer> bubbleSort = new BubbleSort();
        Integer[] expected = {2, 4, 6, 8, 10};
        Assert.assertArrayEquals(expected, bubbleSort.sort(array));
    }

    @Test
    public void testDuplicates() {
        Integer[] array = {3, 5, 2, 6, 6, 2, 1};
        SortAlgorithm<Integer> bubbleSort = new BubbleSort();
        Integer[] expected = {1, 2, 2, 3, 5, 6, 6};
        Assert.assertArrayEquals(expected, bubbleSort.sort(array));
    }
}