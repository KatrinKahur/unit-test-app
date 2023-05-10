
package searches;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciSearchTest {

    @Test
    public void testEmptyArray() {
        FibonacciSearch search = new FibonacciSearch();
        Integer[] array = new Integer[0];
        int index = search.find(array, 5);
        assertEquals(-1, index);
    }

    @Test
    public void testSingleElementArrayFound() {
        FibonacciSearch search = new FibonacciSearch();
        Integer[] array = new Integer[]{5};
        int index = search.find(array, 5);
        assertEquals(0, index);
    }

    @Test
    public void testSingleElementArrayNotFound() {
        FibonacciSearch search = new FibonacciSearch();
        Integer[] array = new Integer[]{6};
        int index = search.find(array, 5);
        assertEquals(-1, index);
    }

    @Test
    public void testDuplicateElements() {
        FibonacciSearch search = new FibonacciSearch();
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 11};
        int index = search.find(array, 10);
        assertTrue(index >= 4 && index <= 11);
    }

    @Test
    public void testElementNotFound() {
        FibonacciSearch search = new FibonacciSearch();
        Integer[] array = new Integer[]{1, 2, 3, 4, 7, 8, 9};
        int index = search.find(array, 5);
        assertEquals(-1, index);
    }

    @Test
    public void testOddLengthArray() {
        FibonacciSearch search = new FibonacciSearch();
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = search.find(array, 6);
        assertEquals(5, index);
    }

    @Test
    public void testEvenLengthArray() {
        FibonacciSearch search = new FibonacciSearch();
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
        int index = search.find(array, 6);
        assertEquals(5, index);
    }
}