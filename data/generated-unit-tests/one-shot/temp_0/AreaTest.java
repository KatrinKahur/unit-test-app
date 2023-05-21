
public class AreaTest {
    @Test
    public void testSurfaceAreaCube() {
        double result = Area.surfaceAreaCube(2);
        Assert.assertEquals(24, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCubeWithNegativeSideLength() {
        Area.surfaceAreaCube(-2);
    }

    @Test
    public void testSurfaceAreaSphere() {
        double result = Area.surfaceAreaSphere(2);
        Assert.assertEquals(50.26548245743669, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaSphereWithNegativeRadius() {
        Area.surfaceAreaSphere(-2);
    }

    @Test
    public void testSurfaceAreaRectangle() {
        double result = Area.surfaceAreaRectangle(2, 3);
        Assert.assertEquals(6, result, 0);
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
        double result = Area.surfaceAreaCylinder(2, 3);
        Assert.assertEquals(62.83185307179586, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCylinderWithNegativeRadius() {
        Area.surfaceAreaCylinder(-2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCylinderWithNegativeHeight() {
        Area.surfaceAreaCylinder(2, -3);
    }

    @Test
    public void testSurfaceAreaSquare() {
        double result = Area.surfaceAreaSquare(2);
        Assert.assertEquals(4, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaSquareWithNegativeSideLength() {
        Area.surfaceAreaSquare(-2);
    }

    @Test
    public void testSurfaceAreaTriangleRectangle() {
        double result = Area.surfaceAreaTriangleRectangle(2, 3);
        Assert.assertEquals(3, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTriangleRectangleWithNegativeBase() {
        Area.surfaceAreaTriangleRectangle(-2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTriangleRectangleWithNegativeHeight() {
        Area.surfaceAreaTriangleRectangle(2, -3);
    }

    @Test
    public void testSurfaceAreaParallelogram() {
        double result = Area.surfaceAreaParallelogram(2, 3);
        Assert.assertEquals(6, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaParallelogramWithNegativeBase() {
        Area.surfaceAreaParallelogram(-2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaParallelogramWithNegativeHeight() {
        Area.surfaceAreaParallelogram(2, -3);
    }

    @Test
    public void testSurfaceAreaTrapezium() {
        double result = Area.surfaceAreaTrapezium(2, 3, 4);
        Assert.assertEquals(10, result, 
public class AreaTest {
    @Test
    public void testSurfaceAreaCube() {
        double result = Area.surfaceAreaCube(2);
        Assert.assertEquals(24, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCubeWithNegativeSideLength() {
        Area.surfaceAreaCube(-2);
    }

    @Test
    public void testSurfaceAreaSphere() {
        double result = Area.surfaceAreaSphere(2);
        Assert.assertEquals(50.26548245743669, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaSphereWithNegativeRadius() {
        Area.surfaceAreaSphere(-2);
    }

    @Test
    public void testSurfaceAreaRectangle() {
        double result = Area.surfaceAreaRectangle(2, 3);
        Assert.assertEquals(6, result, 0);
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
        double result = Area.surfaceAreaCylinder(2, 3);
        Assert.assertEquals(62.83185307179586, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCylinderWithNegativeRadius() {
        Area.surfaceAreaCylinder(-2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCylinderWithNegativeHeight() {
        Area.surfaceAreaCylinder(2, -3);
    }

    @Test
    public void testSurfaceAreaSquare() {
        double result = Area.surfaceAreaSquare(2);
        Assert.assertEquals(4, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaSquareWithNegativeSideLength() {
        Area.surfaceAreaSquare(-2);
    }

    @Test
    public void testSurfaceAreaTriangleRectangle() {
        double result = Area.surfaceAreaTriangleRectangle(2, 3);
        Assert.assertEquals(3, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTriangleRectangleWithNegativeBase() {
        Area.surfaceAreaTriangleRectangle(-2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTriangleRectangleWithNegativeHeight() {
        Area.surfaceAreaTriangleRectangle(2, -3);
    }

    @Test
    public void testSurfaceAreaParallelogram() {
        double result = Area.surfaceAreaParallelogram(2, 3);
        Assert.assertEquals(6, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaParallelogramWithNegativeBase() {
        Area.surfaceAreaParallelogram(-2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaParallelogramWithNegativeHeight() {
        Area.surfaceAreaParallelogram(2, -3);
    }

    @Test
    public void testSurfaceAreaTrapezium() {
        double result = Area.surfaceAreaTrapezium(2, 3, 4);
        Assert.assertEquals(10, result, 
public class AreaTest {
    @Test
    public void testSurfaceAreaCube() {
        double result = Area.surfaceAreaCube(2.0);
        Assert.assertEquals(24.0, result, 0.001);
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
        Assert.assertEquals(6.0, result, 0.001);
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
        Assert.assertEquals(4.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaSquareWithNegativeSideLength() {
        Area.surfaceAreaSquare(-2.0);
    }

    @Test
    public void testSurfaceAreaTriangleRectangle() {
        double result = Area.surfaceAreaTriangleRectangle(2.0, 3.0);
        Assert.assertEquals(3.0, result, 0.001);
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
        Assert.assertEquals(6.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaParallelogramWithNegativeBase() {
        Area.surfaceAreaParallelogram(-2.0, 3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test