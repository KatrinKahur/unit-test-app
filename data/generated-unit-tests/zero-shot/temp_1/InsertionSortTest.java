
import static org.junit.Assert.*;
import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void testSort() {
		Integer[] array = {4, 2, 8, 1, 6, 3, 7, 9, 5};
		Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		InsertionSort insertionSort = new InsertionSort();
		
		assertArrayEquals(expected, insertionSort.sort(array));
	}
	
	@Test
	public void testSortEmptyArray() {
		Integer[] array = {};
		Integer[] expected = {};
		InsertionSort insertionSort = new InsertionSort();
		
		assertArrayEquals(expected, insertionSort.sort(array));
	}
	
	@Test
	public void testSortAlreadySortedArray() {
		Integer[] array = {1, 2, 3, 4, 5};
		Integer[] expected = {1, 2, 3, 4, 5};
		InsertionSort insertionSort = new InsertionSort();
		
		assertArrayEquals(expected, insertionSort.sort(array));
	}
	
	@Test
	public void testSortArrayWithDuplicates() {
		Integer[] array = {4, 2, 8, 1, 6, 3, 7, 9, 5, 1, 2, 3, 4, 5};
		Integer[] expected = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9};
		InsertionSort insertionSort = new InsertionSort();
		
		assertArrayEquals(expected, insertionSort.sort(array));
	}
	
	@Test
	public void testSortArrayWithNegativeNumbers() {
		Integer[] array = {4, -2, 8, -1, 6, 3, 7, -9, 5};
		Integer[] expected = {-9, -2, -1, 3, 4, 5, 6, 7, 8};
		InsertionSort insertionSort = new InsertionSort();
		
		assertArrayEquals(expected, insertionSort.sort(array));
	}
	
	@Test
	public void testSentinelSort() {
		Integer[] array = {4, 2, 8, 1, 6, 3, 7, 9, 5};
		Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		InsertionSort insertionSort = new InsertionSort();
		
		assertArrayEquals(expected, insertionSort.sentinelSort(array));
	}
	
	@Test
	public void testSentinelSortEmptyArray() {
		Integer[] array = {};
		Integer[] expected = {};
		InsertionSort insertionSort = new InsertionSort();
		
		assertArrayEquals(expected, insertionSort.sentinelSort(array));
	}
	
	@Test
	public void testSentinelSortAlreadySortedArray() {
		Integer[] array = {1, 2, 3, 4, 5};
		Integer[] expected = {1, 2, 3, 4, 5};
		InsertionSort insertionSort = new InsertionSort();
		
		assertArrayEquals(expected, insertionSort.sentinelSort(array));
	}
	
	@Test
	public void testSentinelSortArrayWithDuplicates() {
		Integer[] array = {4, 2, 8, 1, 6, 3, 7, 9, 5, 1, 2, 3, 4, 5};
		Integer[] expected = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9};
		InsertionSort insertionSort = new InsertionSort();
		
		assertArrayEquals(expected, insertionSort.sentinelSort(array));
	}
	
	@Test
	public void testSentinelSortArrayWithNegativeNumbers() {
		Integer[] array = {4, -2, 8, -1, 6, 3, 7, -9, 5};
		Integer[] expected = {-9, -2, -1, 3, 4, 5, 6, 7, 8};
		InsertionSort insertionSort = new InsertionSort();
		
		assertArrayEquals(expected, insertionSort.sentinelSort(array));
	}

}