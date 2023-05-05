package others;
import org.junit.Test;
import static org.junit.Assert.*;

public class SudokuTest {

    @Test
    public void testIsSafe() {
        int[][] board = {
                {1, 0, 3, 0},
                {2, 0, 0, 0},
                {0, 3, 0, 1},
                {3, 2, 1, 4}
        };
        assertTrue(Sudoku.isSafe(board, 1, 1, 1));
        assertFalse(Sudoku.isSafe(board, 1, 1, 2));
    }

    @Test
    public void testSolveSudoku() {
        int[][] board = {
                {0, 0, 0, 3},
                {3, 0, 0, 0},
                {0, 4, 0, 2},
                {1, 0, 3, 0}
        };
        assertTrue(Sudoku.solveSudoku(board, 4));
        int[][] solvedBoard = {
                {2, 1, 4, 3},
                {3, 2, 1, 4},
                {4, 3, 2, 1},
                {1, 4, 3, 2}
        };
        assertArrayEquals(solvedBoard, board);
    }

    @Test
    public void testPrint() {
        int[][] board = {
                {1, 0, 3, 0},
                {2, 0, 0, 0},
                {0, 3, 0, 1},
                {3, 2, 1, 4}
        };
        Sudoku.print(board, 4);
        // Expected output:
        // 1 0 3 0
        // 2 0 0 0
        // 0 3 0 1
        // 3 2 1 4
    }
}