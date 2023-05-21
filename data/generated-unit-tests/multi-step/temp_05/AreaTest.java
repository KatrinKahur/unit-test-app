
import org.junit.Test;
import static org.junit.Assert.*;

public class AreaTest {

    @Test
    public void testSurfaceAreaCube() {
        double result = Area.surfaceAreaCube(2.0);
        assertEquals(24.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCubeWithZeroSideLength() {
        Area.surfaceAreaCube(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCubeWithNegativeSideLength() {
        Area.surfaceAreaCube(-2.0);
    }

    @Test
    public void testSurfaceAreaSphere() {
        double result = Area.surfaceAreaSphere(2.0);
        assertEquals(50.265, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaSphereWithZeroRadius() {
        Area.surfaceAreaSphere(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaSphereWithNegativeRadius() {
        Area.surfaceAreaSphere(-2.0);
    }

    @Test
    public void testSurfaceAreaRectangle() {
        double result = Area.surfaceAreaRectangle(2.0, 3.0);
        assertEquals(6.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaRectangleWithZeroLength() {
        Area.surfaceAreaRectangle(0, 3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaRectangleWithNegativeLength() {
        Area.surfaceAreaRectangle(-2.0, 3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaRectangleWithZeroWidth() {
        Area.surfaceAreaRectangle(2.0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaRectangleWithNegativeWidth() {
        Area.surfaceAreaRectangle(2.0, -3.0);
    }

    @Test
    public void testSurfaceAreaCylinder() {
        double result = Area.surfaceAreaCylinder(2.0, 3.0);
        assertEquals(62.831, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCylinderWithZeroRadius() {
        Area.surfaceAreaCylinder(0, 3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCylinderWithNegativeRadius() {
        Area.surfaceAreaCylinder(-2.0, 3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCylinderWithZeroHeight() {
        Area.surfaceAreaCylinder(2.0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCylinderWithNegativeHeight() {
        Area.surfaceAreaCylinder(2.0, -3.0);
    }

    @Test
    public void testSurfaceAreaSquare() {
        double result = Area.surfaceAreaSquare(2.0);
        assertEquals(4.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaSquareWithZeroSideLength() {
        Area.surfaceAreaSquare(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaSquareWithNegativeSideLength() {
        Area.surfaceAreaSquare(-2.0);
    }

    @Test
    public void testSurfaceAreaTriangleRectangle() {
        double result = Area.surfaceAreaTriangleRectangle(2.0, 3.0);
        assertEquals(3.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTriangleRectangleWithZeroBase() {
        Area.surfaceAreaTriangleRectangle(0, 3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTriangleRectangleWithNegativeBase() {
        Area.surfaceAreaTriangleRectangle(-2.0, 3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTriangleRectangleWithZeroHeight() {
        Area.surfaceAreaTriangleRectangle(2.0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTriangleRectangleWithNegativeHeight() {
        Area.surfaceAreaTriangleRectangle(2.0, -3.0);
    }

    @Test
    public void testSurfaceAreaParallelogram() {
        double result = Area.surfaceAreaParallelogram(2.0, 3.0);
        assertEquals(6.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaParallelogramWithZeroBase() {
        Area.surfaceAreaParallelogram(0, 3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaParallelogramWithNegativeBase() {
        Area.surfaceAreaParallelogram(-2.0, 3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaParallelogramWithZeroHeight() {
        Area.surfaceAreaParallelogram(2.0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaParallelogramWithNegativeHeight() {
        Area.surfaceAreaParallelogram(2.0, -3.0);
    }

    @Test
    public void testSurfaceAreaTrapezium() {
        double result = Area.surfaceAreaTrapezium(2.0, 3.0, 4.0);
        assertEquals(10.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTrapeziumWithZeroBase1() {
        Area.surfaceAreaTrapezium(0, 3.0, 4.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTrapeziumWithNegativeBase1() {
        Area.surfaceAreaTrapezium(-2.0, 3.0, 4.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTrapeziumWithZeroBase2() {
        Area.surfaceAreaTrapezium(2.0, 0, 4.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTrapeziumWithNegativeBase2() {
        Area.surfaceAreaTrapezium(2.0, -3.0, 4.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTrapeziumWithZeroHeight() {
        Area.surfaceAreaTrapezium(2.0, 3.0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTrapeziumWithNegativeHeight() {
        Area.surfaceAreaTrapezium(2.0, 3.0, -4.0);
    }

    @Test
    public void testSurfaceAreaCircle() {
        double result = Area.surfaceAreaCircle(2.0);
        assertEquals(12.566, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCircleWithZero