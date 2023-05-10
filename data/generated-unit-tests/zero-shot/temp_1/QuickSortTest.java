
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class QuickSortTest {

    @Test
    public void testIntegerSort() {
        Integer[] arr = {-2, 3, 5, 1, -4, 0};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);
        Integer[] expected = {-4, -2, 0, 1, 3, 5};
        assertTrue(Arrays.equals(expected, arr));
    }

    @Test
    public void testStringSort() {
        String[] arr = {"cat", "dog", "apple", "banana"};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);
        String[] expected = {"apple", "banana", "cat", "dog"};
        assertTrue(Arrays.equals(expected, arr));
    }

    @Test
    public void testEmptyArraySort() {
        Integer[] arr = {};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);
        Integer[] expected = {};
        assertTrue(Arrays.equals(expected, arr));
    }
    
    @Test
    public void testDuplicateValuesSort() {
        Integer[] arr = {3, 1, 2, 3, 5, 4};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);
        Integer[] expected = {1, 2, 3, 3, 4, 5};
        assertTrue(Arrays.equals(expected, arr));
    }
}