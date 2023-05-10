
public class FibonacciSearchTest {
    @Test
    public void testFind() {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        FibonacciSearch search = new FibonacciSearch();
        Assert.assertEquals(2, search.find(array, 3));
        Assert.assertEquals(8, search.find(array, 9));
        Assert.assertEquals(-1, search.find(array, 10));
    }
}