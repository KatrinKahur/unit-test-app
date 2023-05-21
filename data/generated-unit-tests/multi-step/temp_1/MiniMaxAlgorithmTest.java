
import org.junit.Test;
import static org.junit.Assert.*;

public class MiniMaxAlgorithmTest {

    @Test
    public void testMiniMaxReturnsOptimalScore() {
        MiniMaxAlgorithm minimax = new MiniMaxAlgorithm();
        int[] scores = {5, 8, 2, 3, 1, 9, 0, 4}; // Optimal score is 5
        minimax.setScores(scores);
        int optimalScore = minimax.miniMax(0, true, 0, false);
        assertEquals(5, optimalScore);
    }

    @Test
    public void testSetScoresSetsScoresAndHeight() {
        MiniMaxAlgorithm minimax = new MiniMaxAlgorithm();
        int[] scores = {1, 2, 3, 4};
        minimax.setScores(scores);
        assertArrayEquals(scores, minimax.getScores());
        assertEquals(2, minimax.getHeight());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetScoresThrowsIllegalArgumentExceptionForNonPowerOf2Array() {
        MiniMaxAlgorithm minimax = new MiniMaxAlgorithm();
        int[] scores = {1, 2, 3};
        minimax.setScores(scores);
    }

    @Test
    public void testGetRandomScoresGeneratesCorrectLengthOfScores() {
        int[] randomScores = MiniMaxAlgorithm.getRandomScores(3, 99);
        assertEquals(8, randomScores.length);
    }

    @Test
    public void testLog2ReturnsCorrectValue() {
        MiniMaxAlgorithm minimax = new MiniMaxAlgorithm();
        assertEquals(0, minimax.log2(1));
        assertEquals(1, minimax.log2(2));
        assertEquals(2, minimax.log2(4));
        assertEquals(3, minimax.log2(8));
    }
}