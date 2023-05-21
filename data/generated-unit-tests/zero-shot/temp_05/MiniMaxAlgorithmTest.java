
import org.junit.Test;
import static org.junit.Assert.*;

public class MiniMaxAlgorithmTest {

    @Test
    public void testMiniMax() {
        MiniMaxAlgorithm miniMax = new MiniMaxAlgorithm();
        int result = miniMax.miniMax(0, true, 0, false);
        assertTrue(result > 0);
    }

    @Test
    public void testGetRandomScores() {
        int[] scores = MiniMaxAlgorithm.getRandomScores(3, 99);
        assertEquals(8, scores.length);
    }

    @Test
    public void testSetScores() {
        MiniMaxAlgorithm miniMax = new MiniMaxAlgorithm();
        int[] scores = {1, 2, 3, 4};
        miniMax.setScores(scores);
        assertArrayEquals(scores, miniMax.getScores());
    }

    @Test
    public void testGetHeight() {
        MiniMaxAlgorithm miniMax = new MiniMaxAlgorithm();
        assertEquals(2, miniMax.getHeight());
    }
}