package sorts;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SelectionSortTest {

    @Test
    public void testSortInteger() {
        Integer[] arr = {5, 1, 8, 3, 2};
        Integer[] expected = {1, 2, 3, 5, 8};
        SelectionSort sort = new SelectionSort();
        assertArrayEquals(expected, sort.sort(arr));
    }

    @Test
    public void testSortString() {
        String[] arr = {"c", "a", "b", "f"};
        String[] expected = {"a", "b", "c", "f"};
        SelectionSort sort = new SelectionSort();
        assertArrayEquals(expected, sort.sort(arr));
    }

    @Test
    public void testSortEmptyArray() {
        Integer[] arr = {};
        Integer[] expected = {};
        SelectionSort sort = new SelectionSort();
        assertArrayEquals(expected, sort.sort(arr));
    }

    @Test
    public void testSortSingleElementArray() {
        Integer[] arr = {4};
        Integer[] expected = {4};
        SelectionSort sort = new SelectionSort();
        assertArrayEquals(expected, sort.sort(arr));
    }

    @Test
    public void testSortAlreadySortedArray() {
        Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        SelectionSort sort = new SelectionSort();
        assertArrayEquals(expected, sort.sort(arr));
    }

    @Test
    public void testSortReverseSortedArray() {
        Integer[] arr = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};
        SelectionSort sort = new SelectionSort();
        assertArrayEquals(expected, sort.sort(arr));
    }
}