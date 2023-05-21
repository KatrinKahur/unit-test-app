
package searches;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PerfectBinarySearchTest {

    @Test
    public void testBinarySearch_emptyArray() {
        assertEquals(-1, PerfectBinarySearch.binarySearch(new int[]{}, 5));
    }

    @Test
    public void testBinarySearch_targetIsFirst() {
        assertEquals(0, PerfectBinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5}, 1));
    }

    @Test
    public void testBinarySearch_targetIsLast() {
        assertEquals(4, PerfectBinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5}, 5));
    }

    @Test
    public void testBinarySearch_targetIsMiddle() {
        assertEquals(2, PerfectBinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5}, 3));
    }

    @Test
    public void testBinarySearch_targetNotPresent() {
        assertEquals(-1, PerfectBinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5}, 6));
    }

    @Test(expected = NullPointerException.class)
    public void testBinarySearch_inputArrayIsNull() {
        PerfectBinarySearch.binarySearch(null, 5);
    }
}