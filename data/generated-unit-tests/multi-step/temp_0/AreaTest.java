
import org.junit.Test;
import static org.junit.Assert.*;

public class AreaTest {

    @Test
    public void testSurfaceAreaCube() {
        assertEquals(6.0, Area.surfaceAreaCube(1.0), 0.001);
        assertEquals(54.0, Area.surfaceAreaCube(3.0), 0.001);
        try {
            Area.surfaceAreaCube(-1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive sideLength", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaSphere() {
        assertEquals(12.566, Area.surfaceAreaSphere(1.0), 0.001);
        assertEquals(201.062, Area.surfaceAreaSphere(3.0), 0.001);
        try {
            Area.surfaceAreaSphere(-1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive radius", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaRectangle() {
        assertEquals(6.0, Area.surfaceAreaRectangle(2.0, 3.0), 0.001);
        assertEquals(24.0, Area.surfaceAreaRectangle(4.0, 6.0), 0.001);
        try {
            Area.surfaceAreaRectangle(-2.0, 3.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive length", e.getMessage());
        }
        try {
            Area.surfaceAreaRectangle(2.0, -3.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive width", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaCylinder() {
        assertEquals(62.831, Area.surfaceAreaCylinder(1.0, 4.0), 0.001);
        assertEquals(282.743, Area.surfaceAreaCylinder(3.0, 6.0), 0.001);
        try {
            Area.surfaceAreaCylinder(-1.0, 4.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive radius", e.getMessage());
        }
        try {
            Area.surfaceAreaCylinder(1.0, -4.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive height", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaSquare() {
        assertEquals(4.0, Area.surfaceAreaSquare(2.0), 0.001);
        assertEquals(36.0, Area.surfaceAreaSquare(6.0), 0.001);
        try {
            Area.surfaceAreaSquare(-2.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive sideLength", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaTriangleRectangle() {
        assertEquals(3.0, Area.surfaceAreaTriangleRectangle(2.0, 3.0), 0.001);
        assertEquals(12.0, Area.surfaceAreaTriangleRectangle(4.0, 6.0), 0.001);
        try {
            Area.surfaceAreaTriangleRectangle(-2.0, 3.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive base", e.getMessage());
        }
        try {
            Area.surfaceAreaTriangleRectangle(2.0, -3.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive height", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaParallelogram() {
        assertEquals(6.0, Area.surfaceAreaParallelogram(2.0, 3.0), 0.001);
        assertEquals(24.0, Area.surfaceAreaParallelogram(4.0, 6.0), 0.001);
        try {
            Area.surfaceAreaParallelogram(-2.0, 3.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive base", e.getMessage());
        }
        try {
            Area.surfaceAreaParallelogram(2.0, -3.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive height", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaTrapezium() {
        assertEquals(9.0, Area.surfaceAreaTrapezium(2.0, 4.0, 3.0), 0.001);
        assertEquals(21.0, Area.surfaceAreaTrapezium(3.0, 6.0, 4.0), 0.001);
        try {
            Area.surfaceAreaTrapezium(-2.0, 4.0, 3.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive base1", e.getMessage());
        }
        try {
            Area.surfaceAreaTrapezium(2.0, -4.0, 3.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive base2", e.getMessage());
        }
        try {
            Area.surfaceAreaTrapezium(2.0, 4.0, -3.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive height", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaCircle() {
        assertEquals(3.142, Area.surfaceAreaCircle(1.0), 0.001);
        assertEquals(28.274, Area.surfaceAreaCircle(3.0), 0.001);
        try {
            Area.surfaceAreaCircle(-1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive radius", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaHemisphere() {
        assertEquals(12.566, Area.surfaceAreaHemisphere(1.0), 0.001);
        assertEquals(84.778, Area.surfaceAreaHemisphere(3.0), 0.001);
        try {
            Area.surfaceAreaHemisphere(-1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive radius", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaCone() {
        assertEquals(37.699, Area.surfaceAreaCone(1.0, 4.0), 0.001);
        assertEquals(150.796, Area.surfaceAreaCone(3.0, 6.0), 0.001);
        try {
            Area.surfaceAreaCone(-1.0, 4.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive radius", e.getMessage());
        }
        try {
            Area.surfaceAreaCone(1.0, -4.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive height", e.getMessage());
        }
    }
}