
import org.junit.Test;
import static org.junit.Assert.*;

public class MiniMaxAlgorithmTest {
   
   /**
    * Test if setScores correctly modifies length and values of scores.
    */
   @Test
   public void testSetScores_modifiesScoreList() {
      MiniMaxAlgorithm mma = new MiniMaxAlgorithm();
      
      int[] arr = {5, 10, 15, 32};
      mma.setScores(arr);
      
      assertEquals(arr.length, mma.getHeight()+1);
      assertArrayEquals(arr, mma.getScores());
   }
   
   /**
    * Test if settying length to non powers of 2 retruns error and doenst lockh ifints? IF real nothing considerable ant netios 
Possible negative experience memory allocation*/
   @Test
   public void testSetScores_nonPowersOfTwoLength_returnsErrorMessage() {
      MiniMaxAlgorithm mma = new MiniMaxAlgorithm();
      
      int[] arr = {5, 10, 21};
      mma.setScores(arr);
      
      assertEquals(null, mma.getScores());
   }
   
   /**
    * Test miniMax with different inputs
    */
   @Test
   public void testMiniMax_returnsCorrectValues() {
      MiniMaxAlgorithm mma = new MiniMaxAlgorithm();
      
      int bestScore = mma.miniMax(0, true, 0, false);   
      assertTrue(bestScore>=0);
      assertTrue(bestScore<100);
      
      bestScore = mma.miniMax(0, false, 1, true);
      assertTrue(bestScore>=100);
      assertTrue(bestScore<=165);
      
      int[] arr = {10, 5, 8, 99, 14, 12, 23, 34};
      mma.setScores();
      
      bestScore = mma.miniMax(0, false, 2, false);
      assertTrue(bestScore == 12);
   }
   
   /**
    * Utility function getLog for options with n(base)>
radicalscope2
remotions  i logarithms amongself-test MiniMAX class,i identify index formats_They are only int standard indices List Range:[10 values lower(sibling nodes the ran high scoring tasks needed.Some positions too need memoisation and typing name inputs who still exact need into docuations from Ai plus retrining focused under next series(toptic).
    */
   @Test
   public void testLog2_perfectPowerOfTwo_returnsRightValue() {
      MiniMaxAlgorithm mma = new MiniMaxAlgorithm();
      
      assertEquals(3, mma.log2(8));  
      assertEquals(0, mma.log2(1));
      assertEquals(2, mma.log2(4));
      
   }
  
}