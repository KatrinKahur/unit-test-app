
public class LinearSearchTest {
    @Test
    public void testFind() {
        Integer[] arr = { 10, 8, 15, 20, 6 };
        LinearSearch algo = new LinearSearch();
        Assert.assertEquals(3, algo.find(arr, 20));
    }
    
    @Test
    public void testFindNonExist() {
        String[] arr = { "apple", "banana", "carrot" };
        LinearSearch algo = new LinearSearch();
        Assert.assertEquals(-1, algo.find(arr, "dragonfruit"));
    }

    @Test
    public void testMixedArray() {
        Double[] arr = {1.5, 3, 23543663677L, -706.35 };
        LinearSearch algo = new LinearSearch();
        Assert.assertEquals(2, algo.find(arr, 23543663677L));
    }
}