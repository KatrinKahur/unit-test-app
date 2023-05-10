
package others;

import org.junit.Test;
import static org.junit.Assert.*;

public class SudokuTest {

    // Test isSafe method
    @Test
    public void testIsSafe() {
        int[][] board = {
                {1, 0, 0, 0},
                {0, 2, 0, 0},
                {0, 0, 3, 0},
                {0, 0, 0, 4}
        };
        assertTrue(Sudoku.isSafe(board, 0, 1, 2)); // Valid move
        assertFalse(Sudoku.isSafe(board, 2, 1, 2)); // Invalid move in same column
        assertFalse(Sudoku.isSafe(board, 0, 1, 1)); // Invalid move in same row
        assertFalse(Sudoku.isSafe(board, 1, 1, 3)); // Invalid move in same square
    }

    // Test solveSudoku method
    @Test
    public void testSolveSudoku() {
        int[][] board = {
                {0, 0, 9, 0, 3, 0, 0, 0, 5},
                {0, 0, 0, 2, 0, 0, 6, 0, 0},
                {0, 0, 3, 5, 0, 0, 0, 0, 0},
                {1, 8, 0, 0, 0, 0, 3, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 4, 0},
                {0, 0, 6, 0, 0, 8, 4, 0, 0},
                {0, 0, 7, 0, 0, 5, 0, 0, 0},
                {3, 0, 0, 0, 6, 0, 8, 0, 0}
        };
        assertTrue(Sudoku.solveSudoku(board, 9)); // Test solved board
        int[][] board2 = {
                {1, 2, 3, 4},
                {3, 4, 0, 2},
                {4, 0, 2, 3},
                {2, 3, 4, 0}
        };
        assertFalse(Sudoku.solveSudoku(board2, 4)); // Test unsolvable board
    }
}