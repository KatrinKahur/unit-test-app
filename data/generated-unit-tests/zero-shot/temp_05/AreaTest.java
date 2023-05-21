
import org.junit.Test;
import static org.junit.Assert.*;

public class AreaTest {

    @Test
    public void testSurfaceAreaCube() {
        assertEquals(6.0, Area.surfaceAreaCube(1.0), 0.0);
        assertEquals(54.0, Area.surfaceAreaCube(3.0), 0.0);
        try {
            Area.surfaceAreaCube(-1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive sideLength", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaSphere() {
        assertEquals(Math.PI * 4.0, Area.surfaceAreaSphere(1.0), 0.0);
        assertEquals(Math.PI * 16.0, Area.surfaceAreaSphere(2.0), 0.0);
        try {
            Area.surfaceAreaSphere(-1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive radius", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaRectangle() {
        assertEquals(6.0, Area.surfaceAreaRectangle(2.0, 3.0), 0.0);
        assertEquals(20.0, Area.surfaceAreaRectangle(4.0, 5.0), 0.0);
        try {
            Area.surfaceAreaRectangle(-1.0, 2.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive length", e.getMessage());
        }
        try {
            Area.surfaceAreaRectangle(1.0, -2.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive width", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaCylinder() {
        assertEquals(Math.PI * 10.0, Area.surfaceAreaCylinder(1.0, 5.0), 0.0);
        assertEquals(Math.PI * 20.0, Area.surfaceAreaCylinder(2.0, 5.0), 0.0);
        try {
            Area.surfaceAreaCylinder(-1.0, 2.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive radius", e.getMessage());
        }
        try {
            Area.surfaceAreaCylinder(1.0, -2.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive height", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaSquare() {
        assertEquals(1.0, Area.surfaceAreaSquare(1.0), 0.0);
        assertEquals(9.0, Area.surfaceAreaSquare(3.0), 0.0);
        try {
            Area.surfaceAreaSquare(-1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive sideLength", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaTriangleRectangle() {
        assertEquals(3.0, Area.surfaceAreaTriangleRectangle(2.0, 3.0), 0.0);
        assertEquals(12.0, Area.surfaceAreaTriangleRectangle(4.0, 6.0), 0.0);
        try {
            Area.surfaceAreaTriangleRectangle(-1.0, 2.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive base", e.getMessage());
        }
        try {
            Area.surfaceAreaTriangleRectangle(1.0, -2.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive height", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaParallelogram() {
        assertEquals(6.0, Area.surfaceAreaParallelogram(2.0, 3.0), 0.0);
        assertEquals(20.0, Area.surfaceAreaParallelogram(4.0, 5.0), 0.0);
        try {
            Area.surfaceAreaParallelogram(-1.0, 2.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive base", e.getMessage());
        }
        try {
            Area.surfaceAreaParallelogram(1.0, -2.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive height", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaTrapezium() {
        assertEquals(6.0, Area.surfaceAreaTrapezium(1.0, 3.0, 2.0), 0.0);
        assertEquals(12.0, Area.surfaceAreaTrapezium(2.0, 4.0, 3.0), 0.0);
        try {
            Area.surfaceAreaTrapezium(-1.0, 3.0, 2.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive base1", e.getMessage());
        }
        try {
            Area.surfaceAreaTrapezium(1.0, -3.0, 2.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive base2", e.getMessage());
        }
        try {
            Area.surfaceAreaTrapezium(1.0, 3.0, -2.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive height", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaCircle() {
        assertEquals(Math.PI, Area.surfaceAreaCircle(1.0), 0.0);
        assertEquals(Math.PI * 4.0, Area.surfaceAreaCircle(2.0), 0.0);
        try {
            Area.surfaceAreaCircle(-1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive radius", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaHemisphere() {
        assertEquals(Math.PI * 3.0, Area.surfaceAreaHemisphere(1.0), 0.0);
        assertEquals(Math.PI * 12.0, Area.surfaceAreaHemisphere(2.0), 0.0);
        try {
            Area.surfaceAreaHemisphere(-1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive radius", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaCone() {
        assertEquals(Math.PI * 5.0, Area.surfaceAreaCone(1.0, 3.0), 0.0);
        assertEquals(Math.PI * 10.0, Area.surfaceAreaCone(2.0, 3.0), 0.0);
        try {
            Area.surfaceAreaCone(-1.0, 2.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive radius", e.getMessage());
        }
        try {
            Area.surfaceAreaCone(1.0, -2.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive height", e.getMessage());
        }
    }
}