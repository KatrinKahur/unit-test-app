
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class QuickSortTest {

    @Test
    public void testSort() {
        QuickSort sorter = new QuickSort();
        Integer[] arr = {5, 2, 8, 3, 1, 6};
        Integer[] expected = {1, 2, 3, 5, 6, 8};
        assertArrayEquals(expected, sorter.sort(arr));
    }

    @Test
    public void testSortEmpty() {
        QuickSort sorter = new QuickSort();
        Integer[] arr = {};
        Integer[] expected = {};
        assertArrayEquals(expected, sorter.sort(arr));
    }

    @Test
    public void testSortAlreadySorted() {
        QuickSort sorter = new QuickSort();
        Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, sorter.sort(arr));
    }

    @Test
    public void testSortReverseOrder() {
        QuickSort sorter = new QuickSort();
        Integer[] arr = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, sorter.sort(arr));
    }

    @Test
    public void testSortDuplicates() {
        QuickSort sorter = new QuickSort();
        Integer[] arr = {5, 2, 8, 3, 1, 6, 5, 5, 6};
        Integer[] expected = {1, 2, 3, 5, 5, 5, 6, 6, 8};
        assertArrayEquals(expected, sorter.sort(arr));
    }

    @Test
    public void testSortStrings() {
        QuickSort sorter = new QuickSort();
        String[] arr = {"hello", "world", "this", "is", "a", "test"};
        String[] expected = {"a", "hello", "is", "test", "this", "world"};
        assertArrayEquals(expected, sorter.sort(arr));
    }

    @Test
    public void testSortNull() {
        QuickSort sorter = new QuickSort();
        Integer[] arr = null;
        assertNull(sorter.sort(arr));
    }

    @Test
    public void testRandomPartition() {
        Integer[] arr = {5, 2, 8, 3, 1, 6};
        int left = 0;
        int right = arr.length - 1;
        int partitionIndex = QuickSort.randomPartition(arr, left, right);
        assertTrue(partitionIndex >= left && partitionIndex <= right);
    }

    @Test
    public void testPartition() {
        Integer[] arr = {5, 2, 8, 3, 1, 6};
        int left = 0;
        int right = arr.length - 1;
        int partitionIndex = QuickSort.partition(arr, left, right);
        assertTrue(partitionIndex >= left && partitionIndex <= right);
        assertTrue(Arrays.asList(arr).subList(left, partitionIndex).stream().allMatch(i -> i < arr[partitionIndex]));
        assertTrue(Arrays.asList(arr).subList(partitionIndex, right + 1).stream().allMatch(i -> i >= arr[partitionIndex]));
    }

}