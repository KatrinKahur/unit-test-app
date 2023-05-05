package sorts;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testSort() {
        BubbleSort bubbleSort = new BubbleSort();

        Integer[] arr1 = {1, 7, 5, 3, 2, 4, 6};
        Integer[] sorted1 = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(sorted1, bubbleSort.sort(arr1));

        String[] arr2 = {"xyz", "abc", "efg", "lmn"};
        String[] sorted2 = {"abc", "efg", "lmn", "xyz"};
        assertArrayEquals(sorted2, bubbleSort.sort(arr2));

        Float[] arr3 = {1.3f, 0.8f, -3.7f, 2.1f};
        Float[] sorted3 = {-3.7f, 0.8f, 1.3f, 2.1f};
        assertArrayEquals(sorted3, bubbleSort.sort(arr3));

    }

    @Test
    public void testSortWithDuplicates() {
        BubbleSort bubbleSort = new BubbleSort();

        Integer[] arr1 = {9, 5, 8, 1, 2, 3, 3, 4, 5};
        Integer[] sorted1 = {1, 2, 3, 3, 4, 5, 5, 8, 9};
        assertArrayEquals(sorted1, bubbleSort.sort(arr1));

        String[] arr2 = {"xyz", "abc", "lmn", "efg", "lmn", "xyz"};
        String[] sorted2 = {"abc", "efg", "lmn", "lmn", "xyz", "xyz"};
        assertArrayEquals(sorted2, bubbleSort.sort(arr2));

        Double[] arr3 = {10.5, 3.5, -2.7, 5.3, 3.5};
        Double[] sorted3 = {-2.7, 3.5, 3.5, 5.3, 10.5};
        assertArrayEquals(sorted3, bubbleSort.sort(arr3));

    }

    @Test
    public void testSortWithOneElement() {
        BubbleSort bubbleSort = new BubbleSort();

        Integer[] arr1 = {1};
        Integer[] sorted1 = {1};
        assertArrayEquals(sorted1, bubbleSort.sort(arr1));

        String[] arr2 = {"abc"};
        String[] sorted2 = {"abc"};
        assertArrayEquals(sorted2, bubbleSort.sort(arr2));

        Double[] arr3 = {1.3};
        Double[] sorted3 = {1.3};
        assertArrayEquals(sorted3, bubbleSort.sort(arr3));
    }

    /**@Test(expected = NullPointerException.class)
    public void testSortWithNull() {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(null);
    }**/
}