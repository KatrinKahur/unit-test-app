
public class EulersFunctionTest {

    @Test
    public void testGetEuler() {
        Assert.assertEquals(1, EulersFunction.getEuler(1));
        Assert.assertEquals(1, EulersFunction.getEuler(2));
        Assert.assertEquals(2, EulersFunction.getEuler(3));
        Assert.assertEquals(2, EulersFunction.getEuler(4));
        Assert.assertEquals(4, EulersFunction.getEuler(10));
        Assert.assertEquals(24, EulersFunction.getEuler(100));
        Assert.assertEquals(576, EulersFunction.getEuler(10000));
    }

    @Test
    public void testGetEulerForPrimes() {
        Assert.assertEquals(4, EulersFunction.getEuler(7));
        Assert.assertEquals(6, EulersFunction.getEuler(11));
        Assert.assertEquals(40, EulersFunction.getEuler(89));
        Assert.assertEquals(168, EulersFunction.getEuler(541));
    }

    @Test
    public void testGetEulerForPowersOfPrimes() {
        Assert.assertEquals(4, EulersFunction.getEuler(8));
        Assert.assertEquals(6, EulersFunction.getEuler(27));
        Assert.assertEquals(40, EulersFunction.getEuler(81));
        Assert.assertEquals(168, EulersFunction.getEuler(121));
    }

    @Test
    public void testGetEulerForPowersOfTwo() {
        Assert.assertEquals(4, EulersFunction.getEuler(16));
        Assert.assertEquals(8, EulersFunction.getEuler(32));
        Assert.assertEquals(16, EulersFunction.getEuler(64));
        Assert.assertEquals(32, EulersFunction.getEuler(128));
    }

}