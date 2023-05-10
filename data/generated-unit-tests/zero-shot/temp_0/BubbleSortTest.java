
```
import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void testSort() {
        Integer[] arr = {5, 2, 8, 3, 1, 6};
        BubbleSort bs = new BubbleSort();
        Integer[] sortedArr = bs.sort(arr);
        Integer[] expectedArr = {1, 2, 3, 5, 6, 8};
        assertArrayEquals(expectedArr, sortedArr);
    }

    @Test
    public void testSortEmptyArray() {
        Integer[] arr = {};
        BubbleSort bs = new BubbleSort();
        Integer[] sortedArr = bs.sort(arr);
        Integer[] expectedArr = {};
        assertArrayEquals(expectedArr, sortedArr);
    }

    @Test
    public void testSortAlreadySortedArray() {
        Integer[] arr = {1, 2, 3, 4, 5};
        BubbleSort bs = new BubbleSort();
        Integer[] sortedArr = bs.sort(arr);
        Integer[] expectedArr = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedArr, sortedArr);
    }

    @Test
    public void testSortReverseSortedArray() {
        Integer[] arr = {5, 4, 3, 2, 1};
        BubbleSort bs = new BubbleSort();
        Integer[] sortedArr = bs.sort(arr);
        Integer[] expectedArr = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedArr, sortedArr);
    }

    @Test
    public void testSortDuplicateElements() {
        Integer[] arr = {5, 2, 8, 3, 1, 6, 2, 5};
        BubbleSort bs = new BubbleSort();
        Integer[] sortedArr = bs.sort(arr);
        Integer[] expectedArr = {1, 2, 2, 3, 5, 5, 6, 8};
        assertArrayEquals(expectedArr, sortedArr);
    }
}
```