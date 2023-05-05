package searches;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciSearchTest {

    @Test
    public void testFindElementInArray() {
        Integer[] array = {1, 3, 4, 8, 10, 13};
        FibonacciSearch fibonacciSearch = new FibonacciSearch();
        int index = fibonacciSearch.find(array, 4);
        Assertions.assertEquals(2, index);
    }

    @Test
    public void testFindElementNotInArray() {
        Integer[] array = {1, 3, 4, 8, 10, 13};
        FibonacciSearch fibonacciSearch = new FibonacciSearch();
        int index = fibonacciSearch.find(array, 5);
        Assertions.assertEquals(-1, index);
    }

    @Test
    public void testFindElementInSingleElementArray() {
        Integer[] array = {4};
        FibonacciSearch fibonacciSearch = new FibonacciSearch();
        int index = fibonacciSearch.find(array, 4);
        Assertions.assertEquals(0, index);
    }

    @Test
    public void testFindElementNotInSingleElementArray() {
        Integer[] array = {4};
        FibonacciSearch fibonacciSearch = new FibonacciSearch();
        int index = fibonacciSearch.find(array, 5);
        Assertions.assertEquals(-1, index);
    }

    @Test
    public void testFindElementInEmptyArray() {
        Integer[] array = {};
        FibonacciSearch fibonacciSearch = new FibonacciSearch();
        int index = fibonacciSearch.find(array, 4);
        Assertions.assertEquals(-1, index);
    }

    @Test
    public void testFindElementNotInEmptyArray() {
        Integer[] array = {};
        FibonacciSearch fibonacciSearch = new FibonacciSearch();
        int index = fibonacciSearch.find(array, 5);
        Assertions.assertEquals(-1, index);
    }
}