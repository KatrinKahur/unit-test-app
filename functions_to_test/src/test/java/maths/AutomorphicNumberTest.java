package maths;

import org.junit.Test;
import static org.junit.Assert.*;

public class AutomorphicNumberTest {

    @Test
    public void testIsAutomorphicTrue() {
        assertTrue(AutomorphicNumber.isAutomorphic(1));
        assertTrue(AutomorphicNumber.isAutomorphic(5));
        assertTrue(AutomorphicNumber.isAutomorphic(6));
        assertTrue(AutomorphicNumber.isAutomorphic(25));
        assertTrue(AutomorphicNumber.isAutomorphic(76));
        assertTrue(AutomorphicNumber.isAutomorphic(376));
    }

    @Test
    public void testIsAutomorphicFalse() {
        assertFalse(AutomorphicNumber.isAutomorphic(-1));
        assertFalse(AutomorphicNumber.isAutomorphic(7));
        assertFalse(AutomorphicNumber.isAutomorphic(14));
        assertFalse(AutomorphicNumber.isAutomorphic(73));
    }

    @Test
    public void testIsAutomorphic2True() {
        assertTrue(AutomorphicNumber.isAutomorphic2(1));
        assertTrue(AutomorphicNumber.isAutomorphic2(5));
        assertTrue(AutomorphicNumber.isAutomorphic2(6));
        assertTrue(AutomorphicNumber.isAutomorphic2(25));
        assertTrue(AutomorphicNumber.isAutomorphic2(76));
        assertTrue(AutomorphicNumber.isAutomorphic2(376));
    }

    @Test
    public void testIsAutomorphic2False() {
        assertFalse(AutomorphicNumber.isAutomorphic2(-1));
        assertFalse(AutomorphicNumber.isAutomorphic2(7));
        assertFalse(AutomorphicNumber.isAutomorphic2(14));
        assertFalse(AutomorphicNumber.isAutomorphic2(73));
    }

    @Test
    public void testIsAutomorphic3True() {
        assertTrue(AutomorphicNumber.isAutomorphic3("1"));
        assertTrue(AutomorphicNumber.isAutomorphic3("5"));
        assertTrue(AutomorphicNumber.isAutomorphic3("6"));
        assertTrue(AutomorphicNumber.isAutomorphic3("25"));
        assertTrue(AutomorphicNumber.isAutomorphic3("76"));
        assertTrue(AutomorphicNumber.isAutomorphic3("376"));
    }

    @Test
    public void testIsAutomorphic3False() {
        assertFalse(AutomorphicNumber.isAutomorphic3("-1"));
        assertFalse(AutomorphicNumber.isAutomorphic3("7"));
        assertFalse(AutomorphicNumber.isAutomorphic3("14"));
        assertFalse(AutomorphicNumber.isAutomorphic3("73"));
    }
}