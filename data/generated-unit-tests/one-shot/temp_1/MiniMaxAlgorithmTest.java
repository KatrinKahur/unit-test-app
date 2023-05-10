
public class MiniMaxAlgorithmTest {
    
    @Test
    public void testMiniMax() {
        MiniMaxAlgorithm miniMax = new MiniMaxAlgorithm();
        int result = miniMax.miniMax(0, true, 0, false);
        assertTrue(result > 0);
    }
    
    @Test
    public void testGetRandomScores() {
        int[] randomScores = MiniMaxAlgorithm.getRandomScores(2, 25);
        assertEquals(4, randomScores.length);
    }
    
    @Test
    public void testSetScores() {
        MiniMaxAlgorithm miniMax = new MiniMaxAlgorithm();
        int[] scores = {1, 2, 3, 4};
        miniMax.setScores(scores);
        assertArrayEquals(scores, miniMax.getScores());
    }
    
    @Test
    public void testSetScoresWrongNumberOfScores() {
        MiniMaxAlgorithm miniMax = new MiniMaxAlgorithm();
        int[] scores = {1, 2, 3};
        miniMax.setScores(scores);
        assertTrue(System.out.checkError().toString().contains("The number of scores must be a power of 2."));
    }
}