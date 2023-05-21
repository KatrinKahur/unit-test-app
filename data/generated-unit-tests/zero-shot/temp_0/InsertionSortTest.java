
```
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class InsertionSortTest {

    @Test
    public void testSort() {
        Integer[] arr = {5, 2, 8, 3, 1};
        InsertionSort is = new InsertionSort();
        Integer[] sortedArr = is.sort(arr);
        Arrays.sort(arr);
        assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testSortWithRange() {
        Integer[] arr = {5, 2, 8, 3, 1};
        InsertionSort is = new InsertionSort();
        Integer[] sortedArr = is.sort(arr, 1, 4);
        Integer[] expectedArr = {5, 2, 3, 8, 1};
        Arrays.sort(expectedArr, 1, 4);
        assertArrayEquals(expectedArr, sortedArr);
    }

    @Test
    public void testSentinelSort() {
        Integer[] arr = {5, 2, 8, 3, 1};
        InsertionSort is = new InsertionSort();
        Integer[] sortedArr = is.sentinelSort(arr);
        Arrays.sort(arr);
        assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testSentinelSortWithEmptyArray() {
        Integer[] arr = {};
        InsertionSort is = new InsertionSort();
        Integer[] sortedArr = is.sentinelSort(arr);
        assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testMeasureApproxExecTime() {
        Double[] arr = {5.0, 2.0, 8.0, 3.0, 1.0};
        InsertionSort is = new InsertionSort();
        double time = is.measureApproxExecTime(is::sort, arr);
        assertTrue(time > 0);
    }
}
```