
public class SudokuTest {
    private static int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };

    @Test
    public void testSolveSudoku() {
        assertTrue(Sudoku.solveSudoku(board, 9));
    }

    @Test
    public void testIsSafeOnValidSquareWithUnusedNumbers() {
        int[][] smallBoard = {{0,2,3},{4,5,6},{7,8,0}};
        assertTrue(Sudoku.isSafe(smallBoard, 0, 0, 1));
    }

    @Test
    public void testIsSafeOnEmptySquareWithValidSearchNumbersOnInstancesOfObtSubSquareClash() {
        assertFalse(Sudoku.isSafe(board, 3, 3, 2));
        assertFalse(Sudoku.isSafe(board, 4, 4, 9));
        assertFalse(Sudoku.isSafe(board, 5, 5, 6));
    }

    @Test
    public void testPrintWhenInputIsUnresolvable() {
        assertFalse(Sudoku.solveSudoku(new int[][]{{0,0},{0,0}}, 2));
    }
}