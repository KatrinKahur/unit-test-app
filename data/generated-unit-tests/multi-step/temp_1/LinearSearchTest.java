
package searches;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LinearSearchTest {

    @Test
    public void testFind() {
        // Test an empty array
        Integer[] emptyArray = new Integer[0];
        assertEquals(-1, LinearSearch.find(emptyArray, 1));

        // Test an array with only one element
        Integer[] oneElementArray = {5};
        assertEquals(0, LinearSearch.find(oneElementArray, 5));
        assertEquals(-1, LinearSearch.find(oneElementArray, 1));

        // Test an array with multiple elements
        Integer[] multipleElementsArray = {10, 20, 30, 40, 50};
        assertEquals(0, LinearSearch.find(multipleElementsArray, 10));
        assertEquals(2, LinearSearch.find(multipleElementsArray, 30));
        assertEquals(4, LinearSearch.find(multipleElementsArray, 50));
        assertEquals(-1, LinearSearch.find(multipleElementsArray, 15));
    }
}