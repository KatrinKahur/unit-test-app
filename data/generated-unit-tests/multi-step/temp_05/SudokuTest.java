
import org.junit.Test;
import static org.junit.Assert.*;

public class SudokuTest {
    
    // Test for isSafe method
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
        assertFalse(Sudoku.isSafe(board, 2, 2, 8));
        assertFalse(Sudoku.isSafe(board, 2, 2, 7));
    }
    
    // Test for solveSudoku method
    @Test
    public void testSolveSudoku() {
        int[][] board = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        assertTrue(Sudoku.solveSudoku(board, 4));
        int[][] solvedBoard = {{1, 2, 3, 4}, {3, 4, 1, 2}, {2, 1, 4, 3}, {4, 3, 2, 1}};
        assertArrayEquals(solvedBoard, board);
        
        int[][] board2 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}};
        assertFalse(Sudoku.solveSudoku(board2, 4));
        
        int[][] board3 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        assertTrue(Sudoku.solveSudoku(board3, 4));
        int[][] solvedBoard3 = {{1, 2, 3, 4}, {3, 4, 1, 2}, {2, 1, 4, 3}, {4, 3, 2, 1}};
        assertNotEquals(solvedBoard3, board3);
    }
    
    // Test for print method
    @Test
    public void testPrint() {
        int[][] board = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Sudoku.print(board, 3); // manually check printed output
    }
}