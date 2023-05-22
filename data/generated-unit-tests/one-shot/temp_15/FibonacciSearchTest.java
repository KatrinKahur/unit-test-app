
public class FibonacciSearchTest {

    @Test
    public void testFind() {
        Integer[] arr1 = {1, 4, 5, 6, 7, 10, 20, 40};
        FibonacciSearch search = new FibonacciSearch();
        int result = search.find(arr1, 6);
        Assert.assertEquals(3, result);

        String[] arr2 = {"apple", "banana", "kiwi", "orange", "pineapple", "watermelon"};
        result = search.find(arr2, "pineapple");
        Assert.assertEquals(4, result);

        Double[] arr3 = {0.1, 1.2, 3.5, 6.9, 20.3};
        result = search.find(arr3, 0.1);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testFindAgainstMissingElementAndEmptyInput() {
        String[] arr1 = {"apple", "banana", "orange", "pineapple"};
        FibonacciSearch search = new FibonacciSearch();
        int result = search.find(arr1, "cucumber");
        Assert.assertEquals(-1, result);

        Integer[] arr2 = {};
        Assert.assertEquals(-1, search.find(arr2, 2));
    }
}