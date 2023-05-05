package sorts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortTest {

    @Test
    void testSort() {
        Integer[] arr = { 5, 3, 1, 2, 4 };
        MergeSort sorter = new MergeSort();
        assertArrayEquals(new Integer[] { 1, 2, 3, 4, 5 }, sorter.sort(arr));
    }

    @Test
    void testSortDuplicates() {
        Integer[] arr = { 5, 3, 1, 2, 4, 1, 1, 2 };
        MergeSort sorter = new MergeSort();
        assertArrayEquals(new Integer[] { 1, 1, 1, 2, 2, 3, 4, 5 }, sorter.sort(arr));
    }

    @Test
    void testSortEmptyArray() {
        Integer[] arr = new Integer[0];
        MergeSort sorter = new MergeSort();
        assertArrayEquals(new Integer[0], sorter.sort(arr));
    }

    @Test
    void testSortSingleElementArray() {
        Integer[] arr = { 1 };
        MergeSort sorter = new MergeSort();
        assertArrayEquals(new Integer[] { 1 }, sorter.sort(arr));
    }

    @Test
    void testSortAlreadySortedArray() {
        Integer[] arr = { 1, 2, 3, 4, 5 };
        MergeSort sorter = new MergeSort();
        assertArrayEquals(new Integer[] { 1, 2, 3, 4, 5 }, sorter.sort(arr));
    }

    @Test
    void testSortReverseSortedArray() {
        Integer[] arr = { 5, 4, 3, 2, 1 };
        MergeSort sorter = new MergeSort();
        assertArrayEquals(new Integer[] { 1, 2, 3, 4, 5 }, sorter.sort(arr));
    }

    /**@Test
    void testMerge() {
        Integer[] arr = { 1, 3, 5, 2, 4, 6 };
        MergeSort sorter = new MergeSort();
        sorter.merge(arr, 0, 2, 5);
        assertArrayEquals(new Integer[] { 1, 2, 3, 4, 5, 6 }, arr);
    }

    @Test
    void testMergeEmptyArray() {
        Integer[] arr = new Integer[0];
        MergeSort sorter = new MergeSort();
        sorter.merge(arr, 0, -1, 0);
        assertArrayEquals(new Integer[0], arr);
    }

    @Test
    void testMergeSingleElementArray() {
        Integer[] arr = { 1 };
        MergeSort sorter = new MergeSort();
        sorter.merge(arr, 0, -1, 0);
        assertArrayEquals(new Integer[] { 1 }, arr);
    }

    @Test
    void testMergeAlreadySortedArray() {
        Integer[] arr = { 1, 2, 3, 4, 5 };
        MergeSort sorter = new MergeSort();
        sorter.merge(arr, 0, 2, 4);
        assertArrayEquals(new Integer[] { 1, 2, 3, 4, 5 }, arr);
    }**/
}