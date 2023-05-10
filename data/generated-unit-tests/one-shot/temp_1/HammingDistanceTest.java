
public class HammingDistanceTest {

    @Test
    public void testCalculateHammingDistance() throws Exception {
        int distance = HammingDistance.calculateHammingDistance("abcd", "abdd");
        assertEquals(1, distance);
    }

    @Test(expected = Exception.class)
    public void testCalculateHammingDistanceWithUnequalStringLength() throws Exception {
        HammingDistance.calculateHammingDistance("abc", "defgh");
    }

    @Test
    public void testCalculateHammingDistanceWithEmptyStrings() throws Exception {
        int distance = HammingDistance.calculateHammingDistance("", "");
        assertEquals(0, distance);
    }

    @Test
    public void testCalculateHammingDistanceWithSameStrings() throws Exception {
        int distance = HammingDistance.calculateHammingDistance("abcd", "abcd");
        assertEquals(0, distance);
    }

    @Test
    public void testCalculateHammingDistanceWithDifferentCapitalization() throws Exception {
        int distance = HammingDistance.calculateHammingDistance("abcd", "ABCD");
        assertEquals(4, distance);
    }

}