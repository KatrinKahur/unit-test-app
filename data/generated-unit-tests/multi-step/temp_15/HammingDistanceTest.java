
```
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HammingDistanceTest {

    @Test(expected = Exception.class)
    public void testUnevenStrLengths() throws Exception {
        HammingDistance.calculateHammingDistance("abc", "ab"); //expected Exception
    }
    
    @Test(expected = Exception.class)
    public void testEmptyStrInput() throws Exception {
        HammingDistance.calculateHammingDistance("", ""); //expected Exception
    }

    @Test
    public void testEqual() throws Exception {
        assertEquals(0, HammingDistance.calculateHammingDistance("hello", "hello")); //expected 0
    }

    @Test
    public void testDifferentOneCharacter() throws Exception {
        assertEquals(1, HammingDistance.calculateHammingDistance("hello", "hfllo")); //expected 1
    }

    @Test
    public void testDifferentEntireString() throws Exception {
        assertEquals(5, HammingDistance.calculateHammingDistance("hello", "there")); //expected 5
    }
}
```