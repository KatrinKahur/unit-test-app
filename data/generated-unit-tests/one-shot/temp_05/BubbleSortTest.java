
public class BubbleSortTest {

    @Test
    public void testSort() {
        Integer[] array = {5, 2, 8, 12, 1, 6};
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] sortedArray = bubbleSort.sort(array);
        Integer[] expectedArray = {1, 2, 5, 6, 8, 12};
        Assert.assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void testSortWithDuplicates() {
        Integer[] array = {5, 2, 8, 12, 1, 6, 5};
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] sortedArray = bubbleSort.sort(array);
        Integer[] expectedArray = {1, 2, 5, 5, 6, 8, 12};
        Assert.assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void testSortWithNegativeNumbers() {
        Integer[] array = {5, -2, 8, -12, 1, 6};
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] sortedArray = bubbleSort.sort(array);
        Integer[] expectedArray = {-12, -2, 1, 5, 6, 8};
        Assert.assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void testSortWithStrings() {
        String[] array = {"apple", "banana", "pear", "orange", "grape"};
        BubbleSort bubbleSort = new BubbleSort();
        String[] sortedArray = bubbleSort.sort(array);
        String[] expectedArray = {"apple", "banana", "grape", "orange", "pear"};
        Assert.assertArrayEquals(expectedArray, sortedArray);
    }
}