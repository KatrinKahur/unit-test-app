package sorts;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;

public class QuickSortTest {

    @Test
    public void testEmptyArray() {
        Integer[] arr = {};
        Integer[] expected = {};
        QuickSort quickSort = new QuickSort();
        assertArrayEquals(expected, quickSort.sort(arr));
    }

    @Test
    public void testSingleElementArray() {
        Integer[] arr = {5};
        Integer[] expected = {5};
        QuickSort quickSort = new QuickSort();
        assertArrayEquals(expected, quickSort.sort(arr));
    }

    @Test
    public void testAlreadySortedArray() {
        Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        QuickSort quickSort = new QuickSort();
        assertArrayEquals(expected, quickSort.sort(arr));
    }

    @Test
    public void testReverseSortedArray() {
        Integer[] arr = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};
        QuickSort quickSort = new QuickSort();
        assertArrayEquals(expected, quickSort.sort(arr));
    }

    @Test
    public void testRandomArray() {
        Integer[] arr = {1, -4, 5, 3, 7, 6, -2};
        Integer[] expected = {-4, -2, 1, 3, 5, 6, 7};
        QuickSort quickSort = new QuickSort();
        Arrays.sort(expected);
        assertArrayEquals(expected, quickSort.sort(arr));
    }

    @Test
    public void testArrayWithDuplicateElements() {
        Integer[] arr = {5, 1, 2, 4, 1, 3};
        Integer[] expected = {1, 1, 2, 3, 4, 5};
        QuickSort quickSort = new QuickSort();
        assertArrayEquals(expected, quickSort.sort(arr));
    }
}