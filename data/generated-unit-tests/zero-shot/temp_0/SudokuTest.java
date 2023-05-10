
import org.junit.Test;
import static org.junit.Assert.*;

public class SudokuTest {

    @Test
    public void testIsSafe() {
        int[][] board = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertTrue(Sudoku.isSafe(board, 0, 0, 1));
        assertFalse(Sudoku.isSafe(board, 0, 0, 2));
        assertFalse(Sudoku.isSafe(board, 0, 0, 4));
        assertTrue(Sudoku.isSafe(board, 1, 1, 5));
        assertFalse(Sudoku.isSafe(board, 1, 1, 1));
        assertFalse(Sudoku.isSafe(board, 1, 1, 6));
        assertTrue(Sudoku.isSafe(board, 2, 2, 9));
        assertFalse(Sudoku.isSafe(board, 2, 2, 1));
        assertFalse(Sudoku.isSafe(board, 2, 2, 8));
    }

    @Test
    public void testSolveSudoku() {
        int[][] board = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        assertTrue(Sudoku.solveSudoku(board, 4));
        int[][] solvedBoard = {{1, 2, 3, 4}, {3, 4, 1, 2}, {2, 1, 4, 3}, {4, 3, 2, 1}};
        assertArrayEquals(solvedBoard, board);
    }

    @Test
    public void testPrint() {
        int[][] board = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Sudoku.print(board, 3);
        // Output should be:
        // 1 2 3
        // 4 5 6
        // 7 8 9
    }
}