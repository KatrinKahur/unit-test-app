
import org.junit.Test;
import org.junit.Assert;

public class MiniMaxAlgorithmTest {

    @Test
    public void testMiniMax() {
        MiniMaxAlgorithm miniMaxAlgo = new MiniMaxAlgorithm();
        int result = miniMaxAlgo.miniMax(0, true, 0, false);

        Assert.assertNotEquals(0, result);
    }

    @Test
    public void testRandomScores() {
        int[] randomScores = MiniMaxAlgorithm.getRandomScores(2, 10);

        Assert.assertNotNull(randomScores);
        Assert.assertEquals(4, randomScores.length);
    }

    @Test
    public void testGetHeight() {
        MiniMaxAlgorithm miniMaxAlgo = new MiniMaxAlgorithm();
        int height = miniMaxAlgo.getHeight();

        Assert.assertNotEquals(0, height);
    }

    @Test
    public void testSetScores() {
        MiniMaxAlgorithm miniMaxAlgo = new MiniMaxAlgorithm();
        int[] scores = new int[] {1, 2, 3, 4};

        miniMaxAlgo.setScores(scores);
        int[] updatedScores = miniMaxAlgo.getScores();

        Assert.assertArrayEquals(scores, updatedScores);
    }
}