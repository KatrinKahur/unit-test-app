
public class BubbleSortTest {
@Test
public void testSort() {
Integer[] array = {5, 2, 8, 1, 9};
BubbleSort bubbleSort = new BubbleSort();
Integer[] sortedArray = bubbleSort.sort(array);
Assert.assertArrayEquals(new Integer[]{1, 2, 5, 8, 9}, sortedArray);
}

@Test
public void testSortWithDuplicates() {
Integer[] array = {5, 2, 8, 1, 9, 2};
BubbleSort bubbleSort = new BubbleSort();
Integer[] sortedArray = bubbleSort.sort(array);
Assert.assertArrayEquals(new Integer[]{1, 2, 2, 5, 8, 9}, sortedArray);
}

@Test
public void testSortWithEmptyArray() {
Integer[] array = {};
BubbleSort bubbleSort = new BubbleSort();
Integer[] sortedArray = bubbleSort.sort(array);
Assert.assertArrayEquals(new Integer[]{}, sortedArray);
}

@Test
public void testSortWithSingleElementArray() {
Integer[] array = {5};
BubbleSort bubbleSort = new BubbleSort();
Integer[] sortedArray = bubbleSort.sort(array);
Assert.assertArrayEquals(new Integer[]{5}, sortedArray);
}

@Test
public void testSortWithAlreadySortedArray() {
Integer[] array = {1, 2, 3, 4, 5};
BubbleSort bubbleSort = new BubbleSort();
Integer[] sortedArray = bubbleSort.sort(array);
Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, sortedArray);
}

@Test
public void testSortWithReverseSortedArray() {
Integer[] array = {5, 4, 3, 2, 1};
BubbleSort bubbleSort = new BubbleSort();
Integer[] sortedArray = bubbleSort.sort(array);
Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, sortedArray);
}
}