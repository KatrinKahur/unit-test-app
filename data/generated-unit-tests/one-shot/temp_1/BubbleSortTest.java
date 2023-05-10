
public class BubbleSortTest {

    @Test
    public void testSortIntegerArray() {
        Integer[] arr = {5, 2, 9, 1, 5, 6};
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] sortedArr = bubbleSort.sort(arr);
        Arrays.sort(arr);
        Assert.assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testSortStringArray() {
        String[] arr = {"hello", "world", "java", "programming", "language"};
        BubbleSort bubbleSort = new BubbleSort();
        String[] sortedArr = bubbleSort.sort(arr);
        Arrays.sort(arr);
        Assert.assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testSortEmptyArray() {
        Integer[] arr = {};
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] sortedArr = bubbleSort.sort(arr);
        Assert.assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testSortAlreadySortedArray() {
        Double[] arr = {1.0, 2.0, 3.0, 4.0, 5.0};
        BubbleSort bubbleSort = new BubbleSort();
        Double[] sortedArr = bubbleSort.sort(arr);
        Assert.assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testSortReverseSortedArray() {
        Integer[] arr = {5, 4, 3, 2, 1};
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] sortedArr = bubbleSort.sort(arr);
        Arrays.sort(arr);
        Assert.assertArrayEquals(arr, sortedArr);
    }
}