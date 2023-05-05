package others;
import static org.junit.Assert.*;
import org.junit.Test;

public class MiniMaxAlgorithmTest {
    /**@Test
    public void testMiniMax() {
        // Create MiniMaxAlgorithm instance and test with different options.
        MiniMaxAlgorithm mma = new MiniMaxAlgorithm();
        int score1 = mma.miniMax(0, true, 0, false);
        assertEquals(mma.getHeight() - 1, mma.log2(mma.getScores().length));
        assertTrue(score1 > 0);

        int[] testScores = {4, 7, 2, 8, 10, 6, 5, 9};
        mma.setScores(testScores);
        int score2 = mma.miniMax(0, true, 0, true);
        assertArrayEquals(testScores, mma.getScores());
        assertEquals(testScores.length, mma.getScores().length);
        assertEquals(3, mma.getHeight());
        assertTrue(score2 < 11);
    }

    @Test
    public void testGetRandomScores() {
        int size = 4;
        int maxScore = 50;
        int[] randomScores = MiniMaxAlgorithm.getRandomScores(size, maxScore);
        assertEquals(size, mma.log2(randomScores.length));
        for (int i : randomScores) {
            assertTrue(i >= 1 && i <= maxScore);
        }
    }**/
}