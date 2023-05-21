
public class EulersFunctionTest {
    @Test
    public void testGetEuler() {
        Assert.assertEquals(4, EulersFunction.getEuler(10));
        Assert.assertEquals(8, EulersFunction.getEuler(20));
        Assert.assertEquals(16, EulersFunction.getEuler(30));
        Assert.assertEquals(24, EulersFunction.getEuler(40));
        Assert.assertEquals(32, EulersFunction.getEuler(50));
    }
}