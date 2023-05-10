
import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {

    @Test
    public void testSortEmptyArray() {
        Integer[] arr = new Integer[0];
        InsertionSort insertionSort = new InsertionSort();
        Integer[] sortedArr = insertionSort.sort(arr);
        Assert.assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testSortSingleElementArray() {
        Integer[] arr = new Integer[]{1};
        InsertionSort insertionSort = new InsertionSort();
        Integer[] sortedArr = insertionSort.sort(arr);
        Assert.assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testSortArrayInIncreasingOrder() {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        InsertionSort insertionSort = new InsertionSort();
        Integer[] sortedArr = insertionSort.sort(arr);
        Assert.assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testSortArrayInDecreasingOrder() {
        Integer[] arr = new Integer[]{5, 4, 3, 2, 1};
        InsertionSort insertionSort = new InsertionSort();
        Integer[] sortedArr = insertionSort.sort(arr);
        Integer[] expectedArr = new Integer[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expectedArr, sortedArr);
    }

    @Test
    public void testSortArrayWithDuplicateElements() {
        Integer[] arr = new Integer[]{5, 1, 2, 4, 3, 1};
        InsertionSort insertionSort = new InsertionSort();
        Integer[] sortedArr = insertionSort.sort(arr);
        Integer[] expectedArr = new Integer[]{1, 1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expectedArr, sortedArr);
    }

    @Test(expected = ClassCastException.class)
    public void testSortArrayWithNonComparableElements() {
        Object[] arr = new Object[]{new Object(), new Object()};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
    }

    @Test
    public void testSentinelSortEmptyArray() {
        Integer[] arr = new Integer[0];
        InsertionSort insertionSort = new InsertionSort();
        Integer[] sortedArr = insertionSort.sentinelSort(arr);
        Assert.assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testSentinelSortSingleElementArray() {
        Integer[] arr = new Integer[]{1};
        InsertionSort insertionSort = new InsertionSort();
        Integer[] sortedArr = insertionSort.sentinelSort(arr);
        Assert.assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testSentinelSortArrayInIncreasingOrder() {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        InsertionSort insertionSort = new InsertionSort();
        Integer[] sortedArr = insertionSort.sentinelSort(arr);
        Assert.assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testSentinelSortArrayInDecreasingOrder() {
        Integer[] arr = new Integer[]{5, 4, 3, 2, 1};
        InsertionSort insertionSort = new InsertionSort();
        Integer[] sortedArr = insertionSort.sentinelSort(arr);
        Integer[] expectedArr = new Integer[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expectedArr, sortedArr);
    }

    @Test
    public void testSentinelSortArrayWithDuplicateElements() {
        Integer[] arr = new Integer[]{5, 1, 2, 4, 3, 1};
        InsertionSort insertionSort = new InsertionSort();
        Integer[] sortedArr = insertionSort.sentinelSort(arr);
        Integer[] expectedArr = new Integer[]{1, 1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expectedArr, sortedArr);
    }

    @Test(expected = ClassCastException.class)
    public void testSentinelSortArrayWithNonComparableElements() {
        Object[] arr = new Object[]{new Object(), new Object()};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sentinelSort(arr);
    }
}