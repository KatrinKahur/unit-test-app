
public class AreaTest {

    @Test
    public void testSurfaceAreaCube() {
        Assert.assertEquals(54, Area.surfaceAreaCube(3), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCubeWithNegativeSideLength() {
        Area.surfaceAreaCube(-3);
    }

    @Test
    public void testSurfaceAreaSphere() {
        Assert.assertEquals(12.566370614359172, Area.surfaceAreaSphere(1), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaSphereWithNegativeRadius() {
        Area.surfaceAreaSphere(-1);
    }

    @Test
    public void testSurfaceAreaRectangle() {
        Assert.assertEquals(6, Area.surfaceAreaRectangle(2, 3), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaRectangleWithNegativeLength() {
        Area.surfaceAreaRectangle(-2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaRectangleWithNegativeWidth() {
        Area.surfaceAreaRectangle(2, -3);
    }

    @Test
    public void testSurfaceAreaCylinder() {
        Assert.assertEquals(94.24777960769379, Area.surfaceAreaCylinder(2, 5), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCylinderWithNegativeRadius() {
        Area.surfaceAreaCylinder(-2, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCylinderWithNegativeHeight() {
        Area.surfaceAreaCylinder(2, -5);
    }

    @Test
    public void testSurfaceAreaSquare() {
        Assert.assertEquals(16, Area.surfaceAreaSquare(4), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaSquareWithNegativeSideLength() {
        Area.surfaceAreaSquare(-4);
    }

    @Test
    public void testSurfaceAreaTriangleRectangle() {
        Assert.assertEquals(6, Area.surfaceAreaTriangleRectangle(3, 4), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTriangleRectangleWithNegativeBase() {
        Area.surfaceAreaTriangleRectangle(-3, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTriangleRectangleWithNegativeHeight() {
        Area.surfaceAreaTriangleRectangle(3, -4);
    }

    @Test
    public void testSurfaceAreaParallelogram() {
        Assert.assertEquals(12, Area.surfaceAreaParallelogram(3, 4), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaParallelogramWithNegativeBase() {
        Area.surfaceAreaParallelogram(-3, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaParallelogramWithNegativeHeight() {
        Area.surfaceAreaParallelogram(3, -4);
    }

    @Test
    public void testSurfaceAreaTrapezium() {
        Assert.assertEquals(11.5, Area.surfaceAreaTrapezium(3, 4, 3), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTrapeziumWithNegativeBase1() {
        Area.surfaceAreaTrapezium(-3, 4, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTrapeziumWithNegativeBase2() {
        Area.surfaceAreaTrapezium(3, -4, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTrapeziumWithNegativeHeight() {
        Area.surfaceAreaTrapezium(3, 4, -3);
    }

    @Test
    public void testSurfaceAreaCircle() {
        Assert.assertEquals(12.566370614359172, Area.surfaceAreaCircle(2), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCircleWithNegativeRadius() {
        Area.surfaceAreaCircle(-2);
    }

    @Test
    public void testSurfaceAreaHemisphere() {
        Assert.assertEquals(37.69911184307752, Area.surfaceAreaHemisphere(2), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaHemisphereWithNegativeRadius() {
        Area.surfaceAreaHemisphere(-2);
    }

    @Test
    public void testSurfaceAreaCone() {
        Assert.assertEquals(66.19603765410518, Area.surfaceAreaCone(2, 5), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaConeWithNegativeRadius() {
        Area.surfaceAreaCone(-2, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaConeWithNegativeHeight() {
        Area.surfaceAreaCone(2, -5);
    }
}