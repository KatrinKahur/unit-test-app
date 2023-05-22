
Code only.
```
import org.junit.*;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void testSortIntArray() {
        Integer[] arr = {6, 3, 8, 5, null, 2, -3};
        Integer[] sortedArr = QuickSort.sort(arr);
        Integer[] expectedArr = {-3,2,3,5,6,8,null};
        assertArrayEquals(expectedArr, sortedArr);
    }

    @Test
    public void testSortEmptyArray() {
        Integer[] arr = {};
        Integer[] sortedArr = QuickSort.sort(arr);
        assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testSortSingleElementArray() {
        Integer[] arr = {5};
        Integer[] sortedArr = QuickSort.sort(arr);
        assertArrayEquals(arr, sortedArr);
    }

    @Test
    public void testSortAlreadySortedArray() {
        Integer[] arr = {1,2,3,4,5,6};
        Integer[] sortedArr = QuickSort.sort(arr);
        assertArrayEquals(arr, sortedArr);
    }

    @Test(timeout = 1000)
    public void testSortLargeArray() {
        int n = 100000;
        Integer[] arr = new Integer[n];
        for(int i =  0; i < n; i++){
            arr[i] = i-n/2;
        }
        Integer[] sortedArr = QuickSort.sort(arr);


        assertEquals(arr[0],(Integer)(-n/2));
        assertEquals(arr[n-1],(Integer) (n/2 - 1));
    }
}
```