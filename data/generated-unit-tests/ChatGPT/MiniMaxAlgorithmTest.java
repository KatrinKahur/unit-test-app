import org.junit.Test; 
import static org.junit.Assert.*;  
public class MiniMaxAlgorithmTest {      
    @Test     
    public void testMiniMaxWithDepthOne() {         
        MiniMaxAlgorithm m = new MiniMaxAlgorithm();         
        int score = m.miniMax(1, true, 0, false);         
        assertTrue(score > 0);     
        
    }      
    @Test     
    public void testMiniMaxWithDepthTwo() {         
        MiniMaxAlgorithm m = new MiniMaxAlgorithm();         
        int score = m.miniMax(2, true, 0, false);         
        assertTrue(score > 0);     
        
    }     
    @Test     
    public void testMiniMaxWithVerbose() {         
        MiniMaxAlgorithm m = new MiniMaxAlgorithm();         
        int score = m.miniMax(1, true, 0, true);         
        assertTrue(score > 0);     
        
    }      
    @Test     
    public void testSetScores() {         
        MiniMaxAlgorithm m = new MiniMaxAlgorithm();         
        int[] scores = {1, 2, 3, 4};         
        m.setScores(scores);         
        assertArrayEquals(scores, m.getScores());     
        
    }      
    @Test     
    public void testSetScoresWithInvalidLength() {         
        MiniMaxAlgorithm m = new MiniMaxAlgorithm();         
        int[] scores = {1, 2, 3};         
        m.setScores(scores);         
        assertNotEquals(scores, m.getScores());     
        
    }      
    @Test     
    public void testGetHeight() {         
        MiniMaxAlgorithm m = new MiniMaxAlgorithm();         
        assertEquals(3, m.getHeight());     
        
    } 
    
}
