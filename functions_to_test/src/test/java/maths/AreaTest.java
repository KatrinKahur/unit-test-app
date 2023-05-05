package maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AreaTest {

    @Test
    public void testSurfaceAreaCube() {
        assertEquals(6.0, Area.surfaceAreaCube(1.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCube(0.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCube(-1.0));
    }

    @Test
    public void testSurfaceAreaSphere() {
        assertEquals(12.566370614359172, Area.surfaceAreaSphere(1.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaSphere(0.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaSphere(-1.0));
    }

    @Test
    public void testSurfaceAreaRectangle() {
        assertEquals(6.0, Area.surfaceAreaRectangle(2.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaRectangle(0.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaRectangle(2.0, 0.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaRectangle(0.0, 0.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaRectangle(-1.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaRectangle(2.0, -1.0));
    }

    @Test
    public void testSurfaceAreaCylinder() {
        assertEquals(37.69911184307752, Area.surfaceAreaCylinder(1.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCylinder(0.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCylinder(1.0, 0.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCylinder(0.0, 0.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCylinder(-1.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCylinder(1.0, -1.0));
    }

    @Test
    public void testSurfaceAreaSquare() {
        assertEquals(4.0, Area.surfaceAreaSquare(2.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaSquare(0.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaSquare(-1.0));
    }

    @Test
    public void testSurfaceAreaTriangleRectangle() {
        assertEquals(3.0, Area.surfaceAreaTriangleRectangle(2.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaTriangleRectangle(0.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaTriangleRectangle(2.0, 0.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaTriangleRectangle(0.0, 0.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaTriangleRectangle(-1.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaTriangleRectangle(2.0, -1.0));
    }

    @Test
    public void testSurfaceAreaParallelogram() {
        assertEquals(6.0, Area.surfaceAreaParallelogram(2.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaParallelogram(0.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaParallelogram(2.0, 0.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaParallelogram(0.0, 0.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaParallelogram(-1.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaParallelogram(2.0, -1.0));
    }

    @Test
    public void testSurfaceAreaTrapezium() {
        assertEquals(9.0, Area.surfaceAreaTrapezium(2.0, 3.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaTrapezium(0.0, 3.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaTrapezium(2.0, 0.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaTrapezium(2.0, 3.0, 0.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaTrapezium(0.0, 0.0, 0.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaTrapezium(-1.0, 3.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaTrapezium(2.0, -1.0, 3.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaTrapezium(2.0, 3.0, -1.0));
    }

    @Test
    public void testSurfaceAreaCircle() {
        assertEquals(12.566370614359172, Area.surfaceAreaCircle(2.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCircle(0.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCircle(-1.0));
    }

    @Test
    public void testSurfaceAreaHemisphere() {
        assertEquals(12.566370614359172, Area.surfaceAreaHemisphere(1.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaHemisphere(0.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaHemisphere(-1.0));
    }

    @Test
    public void testSurfaceAreaCone() {
        assertEquals(12.566370614359172, Area.surfaceAreaCone(1.0, 1.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCone(0.0, 1.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCone(1.0, 0.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCone(0.0, 0.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCone(-1.0, 1.0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaCone(1.0, -1.0));
    }
}