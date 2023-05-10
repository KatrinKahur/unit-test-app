
public class AreaTest {
    @Test
    public void testSurfaceAreaCube() {
        Assert.assertEquals(54.0, Area.surfaceAreaCube(3.0), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCubeWithNegativeSide() {
        Area.surfaceAreaCube(-3.0);
    }

    @Test
    public void testSurfaceAreaSphere() {
        Assert.assertEquals(50.26548245743669, Area.surfaceAreaSphere(2.0), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaSphereWithNegativeRadius() {
        Area.surfaceAreaSphere(-2.0);
    }

    @Test
    public void testSurfaceAreaRectangle() {
        Assert.assertEquals(10.0, Area.surfaceAreaRectangle(2.0, 5.0), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaRectangleWithNegativeLength() {
        Area.surfaceAreaRectangle(-2.0, 5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaRectangleWithNegativeWidth() {
        Area.surfaceAreaRectangle(2.0, -5.0);
    }

    @Test
    public void testSurfaceAreaCylinder() {
        Assert.assertEquals(94.24777960769379, Area.surfaceAreaCylinder(2.0, 5.0), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCylinderWithNegativeRadius() {
        Area.surfaceAreaCylinder(-2.0, 5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCylinderWithNegativeHeight() {
        Area.surfaceAreaCylinder(2.0, -5.0);
    }

    @Test
    public void testSurfaceAreaSquare() {
        Assert.assertEquals(16.0, Area.surfaceAreaSquare(4.0), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaSquareWithNegativeSide() {
        Area.surfaceAreaSquare(-4.0);
    }

    @Test
    public void testSurfaceAreaTriangleRectangle() {
        Assert.assertEquals(8.0, Area.surfaceAreaTriangleRectangle(4.0, 4.0), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTriangleRectangleWithNegativeBase() {
        Area.surfaceAreaTriangleRectangle(-4.0, 4.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTriangleRectangleWithNegativeHeight() {
        Area.surfaceAreaTriangleRectangle(4.0, -4.0);
    }

    @Test
    public void testSurfaceAreaParallelogram() {
        Assert.assertEquals(15.0, Area.surfaceAreaParallelogram(5.0, 3.0), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaParallelogramWithNegativeBase() {
        Area.surfaceAreaParallelogram(-5.0, 3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaParallelogramWithNegativeHeight() {
        Area.surfaceAreaParallelogram(5.0, -3.0);
    }

    @Test
    public
public class AreaTest {

    @Test
    public void testSurfaceAreaCube() {
        double result = Area.surfaceAreaCube(2.0);
        Assert.assertEquals(24.0, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCubeWithNegativeSideLength() {
        Area.surfaceAreaCube(-2.0);
    }

    @Test
    public void testSurfaceAreaSphere() {
        double result = Area.surfaceAreaSphere(2.0);
        Assert.assertEquals(50.265, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaSphereWithNegativeRadius() {
        Area.surfaceAreaSphere(-2.0);
    }

    @Test
    public void testSurfaceAreaRectangle() {
        double result = Area.surfaceAreaRectangle(2.0, 3.0);
        Assert.assertEquals(6.0, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaRectangleWithNegativeLength() {
        Area.surfaceAreaRectangle(-2.0, 3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaRectangleWithNegativeWidth() {
        Area.surfaceAreaRectangle(2.0, -3.0);
    }

    @Test
    public void testSurfaceAreaCylinder() {
        double result = Area.surfaceAreaCylinder(2.0, 3.0);
        Assert.assertEquals(62.831, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCylinderWithNegativeRadius() {
        Area.surfaceAreaCylinder(-2.0, 3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCylinderWithNegativeHeight() {
        Area.surfaceAreaCylinder(2.0, -3.0);
    }

    @Test
    public void testSurfaceAreaSquare() {
        double result = Area.surfaceAreaSquare(2.0);
        Assert.assertEquals(4.0, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaSquareWithNegativeSideLength() {
        Area.surfaceAreaSquare(-2.0);
    }

    @Test
    public void testSurfaceAreaTriangleRectangle() {
        double result = Area.surfaceAreaTriangleRectangle(2.0, 3.0);
        Assert.assertEquals(3.0, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTriangleRectangleWithNegativeBase() {
        Area.surfaceAreaTriangleRectangle(-2.0, 3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTriangleRectangleWithNegativeHeight() {
        Area.surfaceAreaTriangleRectangle(2.0, -3.0);
    }

    @Test
    public void testSurfaceAreaParallelogram() {
        double result = Area.surfaceAreaParallelogram(2.0, 3.0);
        Assert.assertEquals(6.0, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaParallelogramWithNegativeBase() {
        Area.surfaceAreaParallelogram(-2.0, 3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurface