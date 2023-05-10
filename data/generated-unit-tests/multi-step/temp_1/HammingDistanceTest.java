
package strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class HammingDistanceTest {

    @Test
    public void testCalculateHammingDistanceEqualStrings() throws Exception {
        assertEquals(0, HammingDistance.calculateHammingDistance("abc", "abc"));
    }
    
    @Test(expected = Exception.class)
    public void testCalculateHammingDistanceDifferentLengthStrings() throws Exception {
        HammingDistance.calculateHammingDistance("abc", "abcd");
    }
    
    @Test
    public void testCalculateHammingDistanceOneDifferentCharacter() throws Exception {
        assertEquals(1, HammingDistance.calculateHammingDistance("abc", "abd"));
    }
    
    @Test
    public void testCalculateHammingDistanceAllDifferentCharacters() throws Exception {
        assertEquals(3, HammingDistance.calculateHammingDistance("abc", "xyz"));
    }
    
    @Test(expected = Exception.class)
    public void testCalculateHammingDistanceEmptyStrings() throws Exception {
        HammingDistance.calculateHammingDistance("", "");
    }
    
    @Test(expected = NullPointerException.class)
    public void testCalculateHammingDistanceNullStrings() throws Exception {
        HammingDistance.calculateHammingDistance(null, null);
    }
    
    @Test
    public void testCalculateHammingDistanceSpecialCharacters() throws Exception {
        assertEquals(3, HammingDistance.calculateHammingDistance("!\"#", "$%&"));
    }
}