
import org.junit.Test;
import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void testSort() {
        InsertionSort sorter = new InsertionSort();
        Integer[] unsorted = {5, 1, 8, 3, 2};
        Integer[] expected = {1, 2, 3, 5, 8};
        assertArrayEquals(expected, sorter.sort(unsorted));
    }

    @Test
    public void testSortEmptyArray() {
        InsertionSort sorter = new InsertionSort();
        Integer[] emptyArray = new Integer[0];
        assertArrayEquals(emptyArray, sorter.sort(emptyArray));
    }

    @Test
    public void testSentinelSort() {
        InsertionSort sorter = new InsertionSort();
        Integer[] unsorted = {5, 1, 8, 3, 2};
        Integer[] expected = {1, 2, 3, 5, 8};
        assertArrayEquals(expected, sorter.sentinelSort(unsorted));
    }

    @Test
    public void testSentinelSortEmptyArray() {
        InsertionSort sorter = new InsertionSort();
        Integer[] emptyArray = new Integer[0];
        assertArrayEquals(emptyArray, sorter.sentinelSort(emptyArray));
    }

    @Test
    public void testMeasureApproxExecTime() {
        Double[] randomArray = {5.8, 2.4, 9.1, 4.6, 1.2};
        double expectedTime = 0.001; // expect less than a millisecond
        double actualTime = InsertionSort.measureApproxExecTime(new InsertionSort()::sort, randomArray);
        assertTrue(actualTime < expectedTime);
    }

    @Test
    public void testMeasureApproxExecTimeEmptyArray() {
        Double[] emptyArray = new Double[0];
        double expectedTime = 0.001; // expect less than a millisecond
        double actualTime = InsertionSort.measureApproxExecTime(new InsertionSort()::sort, emptyArray);
        assertTrue(actualTime < expectedTime);
    }

    @Test
    public void testMeasureApproxExecTimeOneElement() {
        Double[] oneElementArray = {1.0};
        double expectedTime = 0.001; // expect less than a millisecond
        double actualTime = InsertionSort.measureApproxExecTime(new InsertionSort()::sort, oneElementArray);
        assertTrue(actualTime < expectedTime);
    }
}