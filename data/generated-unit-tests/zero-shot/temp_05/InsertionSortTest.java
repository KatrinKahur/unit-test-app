
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class InsertionSortTest {

    private InsertionSort insertionSort = new InsertionSort();

    @Test
    public void testSort() {
        Integer[] unsorted = {5, 3, 1, 2, 4};
        Integer[] expected = {1, 2, 3, 4, 5};
        Integer[] sorted = insertionSort.sort(unsorted);
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void testSortWithRange() {
        Integer[] unsorted = {5, 3, 1, 2, 4};
        Integer[] expected = {5, 1, 2, 3, 4};
        Integer[] sorted = insertionSort.sort(unsorted, 1, 5);
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void testSentinelSort() {
        Integer[] unsorted = {5, 3, 1, 2, 4};
        Integer[] expected = {1, 2, 3, 4, 5};
        Integer[] sorted = insertionSort.sentinelSort(unsorted);
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void testSentinelSortWithEmptyArray() {
        Integer[] unsorted = {};
        Integer[] expected = {};
        Integer[] sorted = insertionSort.sentinelSort(unsorted);
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void testMeasureApproxExecTime() {
        Double[] randomArray = {5.4, 3.2, 1.0, 2.7, 4.1};
        double execTime = insertionSort.measureApproxExecTime(insertionSort::sort, randomArray);
        assertTrue(execTime > 0);
    }
}