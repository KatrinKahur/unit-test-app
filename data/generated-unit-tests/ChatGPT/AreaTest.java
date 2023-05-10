package maths;  
import org.junit.Test; 
import static org.junit.Assert.*;  
public class AreaTest {      
    @Test     
    public void testSurfaceAreaCube() {         
        double result = Area.surfaceAreaCube(3.0);         
        assertEquals(54.0, result, 0.0);     
        
    }      
    @Test(expected = IllegalArgumentException.class)     
    public void testSurfaceAreaCubeWithNegativeValue() {         
        Area.surfaceAreaCube(-3.0);     
        
    }      
    @Test     
    public void testSurfaceAreaSphere() {         
        double result = Area.surfaceAreaSphere(4.0);         
        assertEquals(201.06192982974676, result, 0.0);     
        
    }      
    @Test(expected = IllegalArgumentException.class)     
    public void testSurfaceAreaSphereWithNegativeValue() {         
        Area.surfaceAreaSphere(-4.0);     
        
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
    public void testSurfaceAreaSquareWithNegativeValue() {         
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
    
}
