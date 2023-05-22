
import static org.junit.Assert.*;
import org.junit.Test;

public class BubbleSortTest {

	// Test case 1 - Testing sorting in ascending order with new array.
	@Test
	public void testSortAscendingNewArray() {
		Integer[] arrAscending = {9,5,2,7,1,3,4,6,8,0};
		Integer[] expectedOutput = {0,1,2,3,4,5,6,7,8,9};
		BubbleSort sort = new BubbleSort();
		Integer[] result = sort.sort(arrAscending);
		assertArrayEquals(expectedOutput, result); 
	}
	
	// Test case 2 - Testing sorting in descending order with existing array.
	@Test
	public void testSortDescendingExistingArray() {
		Integer[] arrDescending = {10,7,6,5,3,2,9,4,1,8};
		Integer[] sortedOutput = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		BubbleSort sort = new BubbleSort();
		Integer[] sameInstanceArraySort = sort.sort(arrDescending);
		assertArrayEquals(sortedOutput, sameInstanceArraySort);
	}
	
	// Test case 3 - Testing sorting with array having duplicate values.
	@Test
	public void testSortWithArrayDuplicates() {
		Integer[] arrayWithDuplicates = {1,8,3,0,7,7,2,88,8,5,5};
		Integer[] expectedSortingOutput = {0,1,2,3,5,5,7,7,8,8,88};
		BubbleSort sort = new BubbleSort();
		Integer[] sameintanceDuplicatesSorted = sort.sort(arrayWithDuplicates);
		assertArrayEquals(expectedSortingOutput, sameintanceDuplicatesSorted);
	}
	
	// Test case 3 - Testing empty array sorting.
	@Test
	public void testsortEmptyArray() {
		Integer[] emptyArrayForSorting = {};
		Integer[] sortedExpected = {};
		BubbleSort sort = new BubbleSort();
		Integer[] emptySortResult = sort.sort(emptyArrayForSorting);
		assertArrayEquals(sortedExpected, emptySortResult);
	}

}