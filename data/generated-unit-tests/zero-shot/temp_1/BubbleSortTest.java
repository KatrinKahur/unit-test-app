
@RunWith(JUnit4.class)
public class BubbleSortTest {

    @Test
    public void testSort() {
        Integer[] unsorted = {5, 3, 2, 4, 1};
        BubbleSort sorter = new BubbleSort();
        Integer[] sorted = sorter.sort(unsorted);
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void testSortWithDuplicates() {
        Integer[] unsorted = {5, 3, 2, 4, 1, 4, 5};
        BubbleSort sorter = new BubbleSort();
        Integer[] sorted = sorter.sort(unsorted);
        Integer[] expected = {1, 2, 3, 4, 4, 5, 5};
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void testSortWithStrings() {
        String[] unsorted = {"beta", "alpha", "gamma", "delta", "epsilon"};
        BubbleSort sorter = new BubbleSort();
        String[] sorted = sorter.sort(unsorted);
        String[] expected = {"alpha", "beta", "delta", "epsilon", "gamma"};
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void testSortWithEmptyArray() {
        Integer[] unsorted = {};
        BubbleSort sorter = new BubbleSort();
        Integer[] sorted = sorter.sort(unsorted);
        Integer[] expected = {};
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void testSortWithOneElement() {
        Integer[] unsorted = {42};
        BubbleSort sorter = new BubbleSort();
        Integer[] sorted = sorter.sort(unsorted);
        Integer[] expected = {42};
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void testSortAlreadySortedArray() {
        Integer[] unsorted = {1, 2, 3, 4, 5};
        BubbleSort sorter = new BubbleSort();
        Integer[] sorted = sorter.sort(unsorted);
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, sorted);
    }
}