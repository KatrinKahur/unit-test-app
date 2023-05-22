
import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciSearchTest {

    private FibonacciSearch searchAlgorithm = new FibonacciSearch();
    
    @Test
    public void testSingleElementArray() {
        //Arrange
        Integer[] arr = {1};
        int expected = 0;
        //Act
        int actual = searchAlgorithm.find(arr, 1);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testArrayWithMultipleElements() {
        //Arrange
        Integer[] arr = {1, 2, 3, 4, 5};
        int expected = 2;
        //Act
        int actual = searchAlgorithm.find(arr, 3);
        //Assert
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNonExistentElementInArray() {
        //Arrange
        Integer[] arr = {1, 2, 3, 4};
        int expected = -1;
        //Act
        int actual = searchAlgorithm.find(arr, 5);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyArray() {
        //Arrange
        Integer[] arr = {};
        //Act
        int actual = searchAlgorithm.find(arr, 4);
        //Assert
        assertEquals(-1, actual);       
    }
}