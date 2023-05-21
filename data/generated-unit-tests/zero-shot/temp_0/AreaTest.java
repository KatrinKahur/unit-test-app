
import org.junit.Test;
import static org.junit.Assert.*;

public class AreaTest {

    @Test
    public void testSurfaceAreaCube() {
        double result = Area.surfaceAreaCube(2.0);
        assertEquals(24.0, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCubeWithNegativeSideLength() {
        Area.surfaceAreaCube(-2.0);
    }

    @Test
    public void testSurfaceAreaSphere() {
        double result = Area.surfaceAreaSphere(2.0);
        assertEquals(50.26548245743669, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaSphereWithNegativeRadius() {
        Area.surfaceAreaSphere(-2.0);
    }

    @Test
    public void testSurfaceAreaRectangle() {
        double result = Area.surfaceAreaRectangle(2.0, 3.0);
        assertEquals(6.0, result, 0.0);
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
        assertEquals(62.83185307179586, result, 0.0);
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
        assertEquals(4.0, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaSquareWithNegativeSideLength() {
        Area.surfaceAreaSquare(-2.0);
    }

    @Test
    public void testSurfaceAreaTriangleRectangle() {
        double result = Area.surfaceAreaTriangleRectangle(2.0, 3.0);
        assertEquals(3.0, result, 0.0);
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
        assertEquals(6.0, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaParallelogramWithNegativeBase() {
        Area.surfaceAreaParallelogram(-2.0, 3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaParallelogramWithNegativeHeight() {
        Area.surfaceAreaParallelogram(2.0, -3.0);
    }

    @Test
    public void testSurfaceAreaTrapezium() {
        double result = Area.surfaceAreaTrapezium(2.0, 3.0, 4.0);
        assertEquals(10.0, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTrapeziumWithNegativeBase1() {
        Area.surfaceAreaTrapezium(-2.0, 3.0, 4.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTrapeziumWithNegativeBase2() {
        Area.surfaceAreaTrapezium(2.0, -3.0, 4.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaTrapeziumWithNegativeHeight() {
        Area.surfaceAreaTrapezium(2.0, 3.0, -4.0);
    }

    @Test
    public void testSurfaceAreaCircle() {
        double result = Area.surfaceAreaCircle(2.0);
        assertEquals(12.566370614359172, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaCircleWithNegativeRadius() {
        Area.surfaceAreaCircle(-2.0);
    }

    @Test
    public void testSurfaceAreaHemisphere() {
        double result = Area.surfaceAreaHemisphere(2.0);
        assertEquals(37.69911184307752, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaHemisphereWithNegativeRadius() {
        Area.surfaceAreaHemisphere(-2.0);
    }

    @Test
    public void testSurfaceAreaCone() {
        double result = Area.surfaceAreaCone(2.0, 3.0);
        assertEquals(35.22071741263713, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaConeWithNegativeRadius() {
        Area.surfaceAreaCone(-2.0, 3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSurfaceAreaConeWithNegativeHeight() {
        Area.surfaceAreaCone(2.0, -3.0);
    }
}