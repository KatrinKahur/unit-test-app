
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testEmptyArray() {
        Integer[] array = {};
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] expected = {};

        assertArrayEquals(expected, bubbleSort.sort(array));
    }

    @Test
    public void testSingleElementArray() {
        Integer[] array = {1};
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] expected = {1};

        assertArrayEquals(expected, bubbleSort.sort(array));
    }

    @Test
    public void testAlreadySortedArray() {
        Integer[] array = {1, 2, 3, 4, 5};
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] expected = {1, 2, 3, 4, 5};

        assertArrayEquals(expected, bubbleSort.sort(array));
    }

    @Test
    public void testReverseSortedArray() {
        Integer[] array = {5, 4, 3, 2, 1};
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] expected = {1, 2, 3, 4, 5};

        assertArrayEquals(expected, bubbleSort.sort(array));
    }

    @Test
    public void testRandomArray() {
        Integer[] array = {5, 1, 4, 2, 3};
        BubbleSort bubbleSort = new BubbleSort();
        Integer[] expected = {1, 2, 3, 4, 5};

        assertArrayEquals(expected, bubbleSort.sort(array));
    }
}