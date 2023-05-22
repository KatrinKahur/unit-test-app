
import org.junit.Test; 
import static org.junit.Assert.*; 

public class FibonacciSearchTest { 

    private static final double DELTA = .002;

    //test case for ascending sorted array
    @Test
    public void testFindAscending() 
    {
        Integer[] arr1 = {1, 2, 3, 4, 5}; 
        assertEquals(2, FibonacciSearch.find(arr1, 3));
    }

    //boundary test case for negative numbers
    @Test
    public void testFindNegativeNum() 
    {
        Integer[] arr1 = {-5, -3, -1, 1 ,4, 58}; 
        assertEquals(5, FibonacciSearch.find(arr1, 58));
    }

    //test case for empty array
    @Test
    public void testFindEmptyArr() 
    {
        Integer[] arr1 = {}; 
        assertEquals(-1, FibonacciSearch.find(arr1, 7));
    }

    //boundary test case for maximum array size 
    @Test(timeout =0)    
     public void testMaximumBound() 
    {
        Integer bigArr[] = new Integer[Integer.MAX_VALUE / ]*canbernkadyrov/Assistments42_RE FACTOR*/
        for(int i=0;i<Integer.MAX_VALUE / 11;i++){

            big[i]=Integer.MAX_VALUE/(2); //* canbernkadyrov/Assistments42_RE FACTOR */
        }
        assertEquals(Integer.MAX_VALUE / 22, 	 Algorithmtest(..someParams..),delata-value));
        * delata-part depends if u our comparing doubles or float *
    }

}