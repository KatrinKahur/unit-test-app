
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class AreaTest {

    @Test
    public void testSurfaceAreaCube() {
        double sideLength = 2.0;
        double expected = 24.0;
        double actual = Area.surfaceAreaCube(sideLength);
        assertEquals(expected, actual, 0.0);
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCube(-2.0));
    }

    @Test
    public void testSurfaceAreaSphere() {
        double radius = 2.0;
        double expected = 50.26548245743669;
        double actual = Area.surfaceAreaSphere(radius);
        assertEquals(expected, actual, 0.0);
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaSphere(-2.0));
    }

    @Test
    public void testSurfaceAreaRectangle() {
        double length = 2.0;
        double width = 3.0;
        double expected = 6.0;
        double actual = Area.surfaceAreaRectangle(length, width);
        assertEquals(expected, actual, 0.0);
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaRectangle(-2.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaRectangle(2.0, -3.0));
    }

    @Test
    public void testSurfaceAreaCylinder() {
        double radius = 2.0;
        double height = 3.0;
        double expected = 62.83185307179586;
        double actual = Area.surfaceAreaCylinder(radius, height);
        assertEquals(expected, actual, 0.0);
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCylinder(-2.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCylinder(2.0, -3.0));
    }

    @Test
    public void testSurfaceAreaSquare() {
        double sideLength = 2.0;
        double expected = 4.0;
        double actual = Area.surfaceAreaSquare(sideLength);
        assertEquals(expected, actual, 0.0);
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaSquare(-2.0));
    }

    @Test
    public void testSurfaceAreaTriangleRectangle() {
        double base = 2.0;
        double height = 3.0;
        double expected = 3.0;
        double actual = Area.surfaceAreaTriangleRectangle(base, height);
        assertEquals(expected, actual, 0.0);
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaTriangleRectangle(-2.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaTriangleRectangle(2.0, -3.0));
    }

    @Test
    public void testSurfaceAreaParallelogram() {
        double base = 2.0;
        double height = 3.0;
        double expected = 6.0;
        double actual = Area.surfaceAreaParallelogram(base, height);
        assertEquals(expected, actual, 0.0);
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaParallelogram(-2.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaParallelogram(2.0, -3.0));
    }

    @Test
    public void testSurfaceAreaTrapezium() {
        double base1 = 2.0;
        double base2 = 3.0;
        double height = 4.0;
        double expected = 10.0;
        double actual = Area.surfaceAreaTrapezium(base1, base2, height);
        assertEquals(expected, actual, 0.0);
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaTrapezium(-2.0, 3.0, 4.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaTrapezium(2.0, -3.0, 4.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaTrapezium(2.0, 3.0, -4.0));
    }

    @Test
    public void testSurfaceAreaCircle() {
        double radius = 2.0;
        double expected = 12.566370614359172;
        double actual = Area.surfaceAreaCircle(radius);
        assertEquals(expected, actual, 0.0);
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCircle(-2.0));
    }

    @Test
    public void testSurfaceAreaHemisphere() {
        double radius = 2.0;
        double expected = 37.69911184307752;
        double actual = Area.surfaceAreaHemisphere(radius);
        assertEquals(expected, actual, 0.0);
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaHemisphere(-2.0));
    }

    @Test
    public void testSurfaceAreaCone() {
        double radius = 2.0;
        double height = 3.0;
        double expected = 31.41592653589793;
        double actual = Area.surfaceAreaCone(radius, height);
        assertEquals(expected, actual, 0.0);
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCone(-2.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCone(2.0, -3.0));
    }
}