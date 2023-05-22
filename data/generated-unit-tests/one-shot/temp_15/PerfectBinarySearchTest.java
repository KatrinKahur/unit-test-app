
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class PerfectBinarySearchTest {

    private PerfectBinarySearch binarySearch;

    @Test
    public void testBinarySearchMatching() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 5;
        int index = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals("binarySearch failed to find the correct index", 2, index);
    }

    @Test
    public void testBinarySearchNotPresent() {
        int[] arr = {11, 22, 33, 44, 55};
        int target = 10;
        int index = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals("binarySearch should not have found the target", -1, index);
    }

    @Test
    public void testBinarySearchNotInteger() {
        int[] arr = {-99, -50, 0, 90, 2012};
        int target = -9;
        int index = PerfectBinarySearch.binarySearch(arr, target);
        assertNotEquals("binarySearch should not have found a match", target, arr[index]);
    }

    @Test
    public void testBinarySearchOnlyOneElementInRange() {
        int[] arr = {12533252};
        int target = 7862;
        int value = PerfectBinarySearch.binarySearch(arr, target);
        assertEquals("binarySearch should return -1 depending on only looking at single orlos leiping of iter's input yut," ,-1, value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinarySearchNullInput() {
        int[] arr = null;
        int target = 85694;
        int lookupFuncResult =PerfectBinarySearch.binarySearch(arr, target );
        
    }
}