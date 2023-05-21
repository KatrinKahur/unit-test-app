
public class FibonacciSearchTest {
    @Test
    public void testFind() {
        FibonacciSearch search = new FibonacciSearch();
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = search.find(array, 5);
        Assert.assertEquals(4, index);
    }

    @Test
    public void testFindNotFound() {
        FibonacciSearch search = new FibonacciSearch();
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = search.find(array, 10);
        Assert.assertEquals(-1, index);
    }

    @Test
    public void testFindEmptyArray() {
        FibonacciSearch search = new FibonacciSearch();
        Integer[] array = {};
        int index = search.find(array, 5);
        Assert.assertEquals(-1, index);
    }

    @Test
    public void testFindSingleElementArray() {
        FibonacciSearch search = new FibonacciSearch();
        Integer[] array = {5};
        int index = search.find(array, 5);
        Assert.assertEquals(0, index);
    }

    @Test
    public void testFindDuplicateElements() {
        FibonacciSearch search = new FibonacciSearch();
        Integer[] array = {1, 2, 3, 3, 4, 5, 6};
        int index = search.find(array, 3);
        Assert.assertEquals(2, index);
    }
}