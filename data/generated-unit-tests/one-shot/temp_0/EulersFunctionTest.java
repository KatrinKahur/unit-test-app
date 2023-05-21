
public class EulersFunctionTest {
    @Test
    public void testGetEuler() {
        Assert.assertEquals(1, EulersFunction.getEuler(1));
        Assert.assertEquals(1, EulersFunction.getEuler(2));
        Assert.assertEquals(2, EulersFunction.getEuler(3));
        Assert.assertEquals(2, EulersFunction.getEuler(4));
        Assert.assertEquals(4, EulersFunction.getEuler(10));
        Assert.assertEquals(6, EulersFunction.getEuler(20));
        Assert.assertEquals(12, EulersFunction.getEuler(30));
        Assert.assertEquals(16, EulersFunction.getEuler(40));
        Assert.assertEquals(20, EulersFunction.getEuler(50));
    }
}