
public class HammingDistanceTest {
@Test
public void testCalculateHammingDistance() {
assertEquals(0,HammingDistance.calculateHammingDistance("",""));
assertEquals(0,HammingDistance.calculateHammingDistance("a","a"));
assertEquals(2,HammingDistance.calculateHammingDistance("ab","ba"));
assertEquals(1,HammingDistance.calculateHammingDistance("abc","abd"));
}

@Test(expected = Exception.class)
public void testCalculateHammingDistanceStringsWithDifferentLength()
throws Exception{
HammingDistance.calculateHammingDistance("","a");
}
}