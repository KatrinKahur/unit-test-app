
import org.junit.Assert;
import org.junit.Test;

public class HammingDistanceTest {

    @Test
    public void testCalculateHammingDistanceEqualStrings() throws Exception {
        // Given
        String s1 = "abcde";
        String s2 = "abcde";

        // When
        int hDistance = HammingDistance.calculateHammingDistance(s1, s2);

        // Then
        Assert.assertEquals(0, hDistance);
    }

    @Test
    public void testCalculateHammingDistanceDifferentStrings() throws Exception {
        // Given
        String s1 = "abcde";
        String s2 = "abxde";

        // When
        int hDistance = HammingDistance.calculateHammingDistance(s1, s2);

        // Then
        Assert.assertEquals(1, hDistance);
    }

    @Test(expected = Exception.class)
    public void testCalculateHammingDistanceUnequalLengthString() throws Exception {
        // Given
        String s1 = "abcde";
        String s2 = "abcd";

        // When
        HammingDistance.calculateHammingDistance(s1, s2);

        // Then [Expected exception thrown]
    }
}