
public class EulersFunctionTest {

    @Test
    public void testGetEuler() {
        assertEquals(1, EulersFunction.getEuler(1));
        assertEquals(1, EulersFunction.getEuler(2));
        assertEquals(2, EulersFunction.getEuler(3));
        assertEquals(2, EulersFunction.getEuler(4));
        assertEquals(4, EulersFunction.getEuler(10));
        assertEquals(12, EulersFunction.getEuler(30));
        assertEquals(40, EulersFunction.getEuler(100));
        assertEquals(400, EulersFunction.getEuler(1001));
        assertThrows(IllegalArgumentException.class, () -> EulersFunction.getEuler(0));
    }

}

 * We have calculated hand applied/testing some basic number theor me approach therefore extensive unit.
   tests are surprisingly distinct functional test are NOT covered in main logic.
