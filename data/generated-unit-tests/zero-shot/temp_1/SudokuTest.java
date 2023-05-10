
import org.junit.Test;
import static org.junit.Assert.*;

public class SudokuTest {

    @Test
    public void testIsSafeRow() {
        int[][] board = {{1,2,3},{0,0,0},{7,8,9}};
        assertFalse(Sudoku.isSafe(board, 1, 0, 1));
    }

    @Test
    public void testIsSafeColumn() {
        int[][] board = {{1,0,7},{2,0,8},{3,0,9}};
        assertFalse(Sudoku.isSafe(board, 1, 1, 2));
    }

    @Test
    public void testIsSafeBox() {
        int[][] board = {{1,2,3},{4,0,6},{7,8,0}};
        assertFalse(Sudoku.isSafe(board, 1, 2, 5));
    }

    @Test
    public void testSolveSudoku() {
        int[][] board = {{0,0,0,0},{0,0,3,0},{0,2,0,1},{0,0,0,0}};
        assertTrue(Sudoku.solveSudoku(board, 4));
        assertArrayEquals(new int[][]{{4,1,2,3},{1,4,3,2},{3,2,4,1},{2,3,1,4}}, board);
    }

    @Test
    public void testPrint() {
        int[][] board = {{4,1,2,3},{1,4,3,2},{3,2,4,1},{2,3,1,4}};
        Sudoku.print(board, 4);
        // Manually check console output for correctness
    }
}