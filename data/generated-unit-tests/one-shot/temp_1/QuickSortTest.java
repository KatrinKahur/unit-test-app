
public class QuickSortTest {

    @Test
    public void testSort() {
        Integer[] unsortedArray = new Integer[] {5, 3, 1, 2, 4, 6};
        Integer[] sortedArray = new Integer[] {1, 2, 3, 4, 5, 6};

        QuickSort quickSort = new QuickSort();
        Integer[] result = quickSort.sort(unsortedArray);

        assertArrayEquals(sortedArray, result);
    }

    @Test
    public void testRandomPartition() {
        Integer[] array = new Integer[] {3, 1, 2, 5, 4};
        int left = 0;
        int right = array.length - 1;

        QuickSort quickSort = new QuickSort();
        int result = quickSort.randomPartition(array, left, right);

        assertTrue(result >= left && result <= right);
    }

    @Test
    public void testPartition() {
        Integer[] array = new Integer[] {3, 1, 2, 5, 4};
        int left = 0;
        int right = array.length - 1;

        QuickSort quickSort = new QuickSort();
        int result = quickSort.partition(array, left, right);

        assertEquals(2, result);
    }
}