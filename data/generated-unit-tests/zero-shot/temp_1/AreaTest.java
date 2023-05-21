
```
import maths.Area;
import org.junit.Test;
import static org.junit.Assert.*;

public class AreaTest {

    @Test
    public void testSurfaceAreaCube() {
        assertEquals(54.0, Area.surfaceAreaCube(3.0), 0.0);
        assertEquals(24.0, Area.surfaceAreaCube(2.0), 0.0);
        try {
            Area.surfaceAreaCube(0.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive sideLength", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaSphere() {
        assertEquals(12.566370614359172, Area.surfaceAreaSphere(1.0), 0.0);
        assertEquals(201.06192982974676, Area.surfaceAreaSphere(3.2), 0.0);
        try {
            Area.surfaceAreaSphere(0.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive radius", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaRectangle() {
        assertEquals(6.0, Area.surfaceAreaRectangle(2.0, 3.0), 0.0);
        assertEquals(16.0, Area.surfaceAreaRectangle(4.0, 4.0), 0.0);
        try {
            Area.surfaceAreaRectangle(0.0, 3.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive length", e.getMessage());
        }
        try {
            Area.surfaceAreaRectangle(4.0, -1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive width", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaCylinder() {
        assertEquals(94.24777960769379, Area.surfaceAreaCylinder(2.0, 6.0), 0.0);
        assertEquals(113.09733552923254, Area.surfaceAreaCylinder(3.0, 5.0), 0.0);
        try {
            Area.surfaceAreaCylinder(0.0, 3.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive radius", e.getMessage());
        }
        try {
            Area.surfaceAreaCylinder(4.0, -1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive radius", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaSquare() {
        assertEquals(4.0, Area.surfaceAreaSquare(2.0), 0.0);
        assertEquals(49.0, Area.surfaceAreaSquare(7.0), 0.0);
        try {
            Area.surfaceAreaSquare(0.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive sideLength", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaTriangleRectangle() {
        assertEquals(3.0, Area.surfaceAreaTriangleRectangle(2.0, 3.0), 0.0);
        assertEquals(8.0, Area.surfaceAreaTriangleRectangle(4.0, 4.0), 0.0);
        try {
            Area.surfaceAreaTriangleRectangle(0.0, 3.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive base", e.getMessage());
        }
        try {
            Area.surfaceAreaTriangleRectangle(4.0, -1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive height", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaParallelogram() {
        assertEquals(6.0, Area.surfaceAreaParallelogram(2.0, 3.0), 0.0);
        assertEquals(32.0, Area.surfaceAreaParallelogram(4.0, 8.0), 0.0);
        try {
            Area.surfaceAreaParallelogram(0.0, 3.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive base", e.getMessage());
        }
        try {
            Area.surfaceAreaParallelogram(4.0, -1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive height", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaTrapezium() {
        assertEquals(15.0, Area.surfaceAreaTrapezium(3.0, 4.0, 5.0), 0.0);
        assertEquals(20.0, Area.surfaceAreaTrapezium(4.0, 6.0, 4.0), 0.0);
        try {
            Area.surfaceAreaTrapezium(0.0, 4.0, 2.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive base1", e.getMessage());
        }
        try {
            Area.surfaceAreaTrapezium(4.0, 0.0, 2.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive base2", e.getMessage());
        }
        try {
            Area.surfaceAreaTrapezium(4.0, 6.0, -1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive height", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaCircle() {
        assertEquals(3.141592653589793, Area.surfaceAreaCircle(1.0), 0.0);
        assertEquals(50.26548245743669, Area.surfaceAreaCircle(4.0), 0.0);
        try {
            Area.surfaceAreaCircle(0.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive radius", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaHemisphere() {
        assertEquals(12.566370614359172, Area.surfaceAreaHemisphere(1.0), 0.0);
        assertEquals(50.26548245743669, Area.surfaceAreaHemisphere(2.0), 0.0);
        try {
            Area.surfaceAreaHemisphere(0.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive radius", e.getMessage());
        }
    }

    @Test
    public void testSurfaceAreaCone() {
        assertEquals(37.69911184307752, Area.surfaceAreaCone(2.0, 3.0), 0.0);
        assertEquals(33.838752524973845, Area.surfaceAreaCone(1.0, 5.0), 0.0);
        try {
            Area.surfaceAreaCone(0.0, 3.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive radius", e.getMessage());
        }
        try {
            Area.surfaceAreaCone(4.0, -1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Must be a positive height", e.getMessage());
        }
    }
}
```