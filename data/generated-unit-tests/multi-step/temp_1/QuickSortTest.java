
@RunWith(JUnit4.class)
public class QuickSortTest {

    private Integer[] sortedArray = {1, 2, 3, 4, 5};
    private Integer[] reverseArray = {5, 4, 3, 2, 1};
    private Integer[] emptyArray = {};
    private Integer[] singleArray = {1};
    private Integer[] randomArray = {8, 3, 7, 4, 1};

    private QuickSort quickSort;

    @Before
    public void setUp() {
        quickSort = new QuickSort();
    }

    @Test
    public void sortSortedArray() {
        assertArrayEquals(sortedArray, quickSort.sort(sortedArray));
    }

    @Test
    public void sortReverseArray() {
        assertArrayEquals(sortedArray, quickSort.sort(reverseArray));
    }

    @Test
    public void sortEmptyArray() {
        assertArrayEquals(emptyArray, quickSort.sort(emptyArray));
    }

    @Test
    public void sortSingleArray() {
        assertArrayEquals(singleArray, quickSort.sort(singleArray));
    }

    @Test
    public void sortRandomArray() {
        Integer[] expectedArray = {1, 3, 4, 7, 8};
        assertArrayEquals(expectedArray, quickSort.sort(randomArray));
    }

    @Test
    public void randomPartitionTest() {
        Integer[] array = {3, 7, 1, 4, 8};
        int partitionIndex = QuickSort.randomPartition(array, 0, array.length - 1);
        assertTrue(partitionIndex >= 0 && partitionIndex < array.length);
    }

    @Test
    public void partitionTest() {
        Integer[] array = {3, 7, 1, 4, 8};
        int partitionIndex = QuickSort.partition(array, 0, array.length - 1);
        assertTrue(partitionIndex >= 0 && partitionIndex < array.length);
    }
}