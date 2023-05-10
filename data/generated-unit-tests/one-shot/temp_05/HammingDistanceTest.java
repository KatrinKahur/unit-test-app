
public class HammingDistanceTest {

    @Test
    public void testHammingDistance() throws Exception {
        Assert.assertEquals(0, HammingDistance.calculateHammingDistance("abc", "abc"));
        Assert.assertEquals(3, HammingDistance.calculateHammingDistance("abc", "def"));
        Assert.assertEquals(1, HammingDistance.calculateHammingDistance("abc", "abd"));
        Assert.assertEquals(2, HammingDistance.calculateHammingDistance("abc", "adc"));
    }

    @Test(expected = Exception.class)
    public void testHammingDistanceThrowsException() throws Exception {
        HammingDistance.calculateHammingDistance("abc", "abcd");
    }
}