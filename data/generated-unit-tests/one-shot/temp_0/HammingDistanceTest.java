
public class HammingDistanceTest {
    @Test
    public void testCalculateHammingDistance() throws Exception {
        String s1 = "abcde";
        String s2 = "abcee";
        int result = HammingDistance.calculateHammingDistance(s1, s2);
        Assert.assertEquals(1, result);
    }

    @Test(expected = Exception.class)
    public void testCalculateHammingDistanceThrowsException() throws Exception {
        String s1 = "abcde";
        String s2 = "abc";
        HammingDistance.calculateHammingDistance(s1, s2);
    }
}