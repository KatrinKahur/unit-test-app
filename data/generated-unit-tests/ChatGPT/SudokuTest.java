import static org.junit.Assert.assertEquals; 
import static org.junit.Assert.assertFalse; 
import static org.junit.Assert.assertTrue; 
import org.junit.Test;  
public class SudokuTest {
     
	@Test    
	public void testIsSafe() {       
		int[][] board = {          
		{1, 2, 3},          
		{4, 5, 6},          
		{7, 8, 9}       
		};       
		assertTrue(Sudoku.isSafe(board, 0, 0, 5)); 
		// safe in row       
		assertTrue(Sudoku.isSafe(board, 0, 0, 7)); 
		// safe in column       
		assertFalse(Sudoku.isSafe(board, 0, 0, 1)); 
		// unsafe in box    
	}     
	@Test    
	public void testSolveSudoku() {       
		int[][] board = {          
		{0, 0, 0, 0},          
		{0, 0, 3, 0},          
		{2, 0, 0, 0},          
		{0, 0, 0, 4}       
		};       
		Sudoku.solveSudoku(board, 4);       
		int[][] expected = {          
		{1, 4, 2, 3},          
		{3, 2, 3, 1},          
		{2, 1, 4, 3},          
		{4, 3, 1, 4}       
		};       
		for (int i = 0; i < expected.length; i++) {          
			for (int j = 0; j < expected[0].length; j++) {             
				assertEquals(expected[i][j], board[i][j]);          
			}       
		}    
	}
	@Test    
	public void testPrint() {       
		int[][] board = {          
		{1, 2, 3},          
		{4, 5, 6},          
		{7, 8, 9}       
		};       
		Sudoku.print(board, 3);       
		// expected output:       
		// 1 2 3        
		// 4 5 6        
		// 7 8 9     
	}      
}
