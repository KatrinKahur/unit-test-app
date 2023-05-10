
public class FibonacciSearchTest {
    @Test
    public void testFindElementInArray() {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        FibonacciSearch fibonacciSearch = new FibonacciSearch();
        int result = fibonacciSearch.find(array, 4);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testElementNotInArray() {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        FibonacciSearch fibonacciSearch = new FibonacciSearch();
        int result = fibonacciSearch.find(array, 10);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testFindElementInArrayWithDuplicates() {
        Integer[] array = {1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 9, 9};
        FibonacciSearch fibonacciSearch = new FibonacciSearch();
        int result = fibonacciSearch.find(array, 6);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testEmptyArray() {
        Integer[] array = {};
        FibonacciSearch fibonacciSearch = new FibonacciSearch();
        int result = fibonacciSearch.find(array, 4);
        Assert.assertEquals(-1, result);
    }
}