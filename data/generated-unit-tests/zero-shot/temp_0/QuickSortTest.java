
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class QuickSortTest {

    @Test
    public void testSort() {
        Integer[] arr = {5, 2, 9, 1, 5, 6};
        QuickSort qs = new QuickSort();
        Integer[] sortedArr = qs.sort(arr);
        Arrays.sort(arr);
        assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testSortEmptyArray() {
        Integer[] arr = {};
        QuickSort qs = new QuickSort();
        Integer[] sortedArr = qs.sort(arr);
        assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testSortAlreadySortedArray() {
        Integer[] arr = {1, 2, 3, 4, 5};
        QuickSort qs = new QuickSort();
        Integer[] sortedArr = qs.sort(arr);
        assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testSortReverseSortedArray() {
        Integer[] arr = {5, 4, 3, 2, 1};
        QuickSort qs = new QuickSort();
        Integer[] sortedArr = qs.sort(arr);
        Arrays.sort(arr);
        assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testSortDuplicateElements() {
        Integer[] arr = {5, 2, 9, 1, 5, 6, 2, 9};
        QuickSort qs = new QuickSort();
        Integer[] sortedArr = qs.sort(arr);
        Arrays.sort(arr);
        assertArrayEquals(arr, sortedArr);
    }
}