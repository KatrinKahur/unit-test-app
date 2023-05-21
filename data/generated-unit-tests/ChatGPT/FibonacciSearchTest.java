import org.junit.Test; import static org.junit.Assert.*;  
public class FibonacciSearchTest {      
    @Test     
    public void testFind() {         
        FibonacciSearch search = new FibonacciSearch();          
        // Test case 1: Array with one element         
        Integer[] arr1 = {1};         
        assertEquals(0, search.find(arr1, 1));          
        // Test case 2: Array with multiple elements, key exists         
        Integer[] arr2 = {1, 2, 3, 4, 5, 6};         
        assertEquals(2, search.find(arr2, 3));          
        // Test case 3: Array with multiple elements, key doesn't exist         
        Integer[] arr3 = {1, 2, 3, 4, 5, 6};         
        assertEquals(-1, search.find(arr3, 7));          
        // Test case 4: Array with multiple elements, key is the first element         
        Integer[] arr4 = {1, 2, 3, 4, 5, 6};         
        assertEquals(0, search.find(arr4, 1));          
        // Test case 5: Array with multiple elements, key is the last element        
        Integer[] arr5 = {1, 2, 3, 4, 5, 6};         
        assertEquals(5, search.find(arr5, 6));          
        // Test case 6: Array with multiple elements, key is in the middle         
        Integer[] arr6 = {1, 2, 3, 4, 5, 6, 7};         
        assertEquals(2, search.find(arr6, 3));     
        
    } 
    
}
