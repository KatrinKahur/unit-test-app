
import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void testSort() {
        Integer[] arr = {5, 3, 1, 4, 2};
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] sortedArr = bubbleSort.sort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, sortedArr);
    }

    @Test
    public void testSortWithDuplicates() {
        Integer[] arr = {5, 3, 1, 4, 2, 5, 3};
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] sortedArr = bubbleSort.sort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 3, 4, 5, 5}, sortedArr);
    }

    @Test
    public void testSortWithNegativeNumbers() {
        Integer[] arr = {5, -3, 1, 4, -2};
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] sortedArr = bubbleSort.sort(arr);
        assertArrayEquals(new Integer[]{-3, -2, 1, 4, 5}, sortedArr);
    }

    @Test
    public void testSortWithEmptyArray() {
        Integer[] arr = {};
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] sortedArr = bubbleSort.sort(arr);
        assertArrayEquals(new Integer[]{}, sortedArr);
    }

    @Test
    public void testSortWithSingleElementArray() {
        Integer[] arr = {1};
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] sortedArr = bubbleSort.sort(arr);
        assertArrayEquals(new Integer[]{1}, sortedArr);
    }
}