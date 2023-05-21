
public class SudokuTest {
    @Test
    public void testIsSafe() {
        int[][] board = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Assert.assertTrue(Sudoku.isSafe(board, 0, 0, 1));
        Assert.assertFalse(Sudoku.isSafe(board, 0, 0, 2));
        Assert.assertFalse(Sudoku.isSafe(board, 0, 0, 4));
        Assert.assertFalse(Sudoku.isSafe(board, 0, 0, 7));
    }

    @Test
    public void testSolveSudoku() {
        int[][] board = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                         {5, 2, 0, 0, 0, 0, 0, 0, 0},
                         {0, 8, 7, 0, 0, 0, 0, 3, 1},
                         {0, 0, 3, 0, 0, 0, 0, 2, 0},
                         {9, 0, 0, 8, 0, 0, 0, 0, 5},
                         {0, 5, 0, 0, 0, 0, 6, 0, 0},
                         {1, 3, 0, 0, 0, 0, 2, 5, 0},
                         {0, 0, 0, 0, 0, 0, 0, 7, 4},
                         {0, 0, 5, 2, 0, 6, 3, 0, 0}};
        Assert.assertTrue(Sudoku.solveSudoku(board, 9));
    }
}