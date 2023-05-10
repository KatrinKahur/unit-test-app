
import org.junit.Test;
import static org.junit.Assert.*;

public class MiniMaxAlgorithmTest {

    @Test
    public void testMiniMax() {
        MiniMaxAlgorithm miniMax = new MiniMaxAlgorithm();
        int result = miniMax.miniMax(0, true, 0, false);
        assertTrue(result >= 1 && result <= 99);
    }

    @Test
    public void testGetRandomScores() {
        int[] scores = MiniMaxAlgorithm.getRandomScores(3, 99);
        assertEquals(8, scores.length);
        for (int score : scores) {
            assertTrue(score >= 1 && score <= 99);
        }
    }

    @Test
    public void testSetScores() {
        MiniMaxAlgorithm miniMax = new MiniMaxAlgorithm();
        int[] scores = {1, 2, 3, 4};
        miniMax.setScores(scores);
        assertArrayEquals(scores, miniMax.getScores());
        assertEquals(2, miniMax.getHeight());
    }

    @Test
    public void testSetScoresInvalid() {
        MiniMaxAlgorithm miniMax = new MiniMaxAlgorithm();
        int[] scores = {1, 2, 3};
        miniMax.setScores(scores);
        assertNotEquals(scores, miniMax.getScores());
    }

    @Test
    public void testGetHeight() {
        MiniMaxAlgorithm miniMax = new MiniMaxAlgorithm();
        assertEquals(2, miniMax.getHeight());
    }

    @Test
    public void testLog2() {
        MiniMaxAlgorithm miniMax = new MiniMaxAlgorithm();
        assertEquals(0, miniMax.log2(1));
        assertEquals(1, miniMax.log2(2));
        assertEquals(2, miniMax.log2(4));
        assertEquals(3, miniMax.log2(8));
    }
}