
package sorts;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testSortForEmptyArray(){
        Integer[] empty = {};
        assertArrayEquals(empty, bubbleSort.sort(empty));
    }

    @Test
    public void testSortForArrayWithSingleElement(){
        Integer[] arr = {4};
        Integer[] expected = {4};
        assertArrayEquals(expected, bubbleSort.sort(arr));
    }

    @Test
    public void testSortForArrayWithDistinctElements(){
        Integer[] input = {4,2,1,3};
        Integer[] expected = {1,2,3,4};
        assertArrayEquals(expected, bubbleSort.sort(input));
    }

    @Test
    public void testSortForArrayWithLargeNumberOfElements(){
        Integer[] large = new Integer[10000];
        Integer[] expectedLarge = new Integer[10000];

        for(int i=0;i<large.length;i++){
            large[i] = i*2 + 12;
            expectedLarge[i] = i*2 + 12;
        }

        for(int i=2000;i<3000;i++){
            BubbleSortTest.swapNumbers(i-500,i-200);
            BubbleSortTest.swapNumbers(i+200,i+500);
        }

        assertArrayEquals(expectedLarge, bubbleSort.sort(large));
    }

    public static void swapNumbers(int i, int j) {
        Integer temp = i;
        i = j;
        j = temp;
    }
}