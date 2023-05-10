
public class MiniMaxAlgorithmTest {
    @Test
    public void testMiniMax() {
        MiniMaxAlgorithm miniMax = new MiniMaxAlgorithm();
        int result = miniMax.miniMax(0, true, 0, false);
        Assert.assertTrue(result >= 0 && result <= 99);
    }

    @Test
    public void testGetRandomScores() {
        int[] scores = MiniMaxAlgorithm.getRandomScores(3, 99);
        Assert.assertEquals(8, scores.length);
        for (int score : scores) {
            Assert.assertTrue(score >= 1 && score <= 99);
        }
    }

    @Test
    public void testSetScores() {
        MiniMaxAlgorithm miniMax = new MiniMaxAlgorithm();
        int[] scores = {1, 2, 3, 4};
        miniMax.setScores(scores);
        Assert.assertArrayEquals(scores, miniMax.getScores());
        Assert.assertEquals(2, miniMax.getHeight());
    }

    @Test
    public void testSetScoresInvalid() {
        MiniMaxAlgorithm miniMax = new MiniMaxAlgorithm();
        int[] scores = {1, 2, 3};
        miniMax.setScores(scores);
        Assert.assertNotEquals(scores, miniMax.getScores());
    }

    @Test
    public void testLog2() {
        MiniMaxAlgorithm miniMax = new MiniMaxAlgorithm();
        Assert.assertEquals(0, miniMax.log2(1));
        Assert.assertEquals(1, miniMax.log2(2));
        Assert.assertEquals(2, miniMax.log2(4));
        Assert.assertEquals(3, miniMax.log2(8));
    }
}