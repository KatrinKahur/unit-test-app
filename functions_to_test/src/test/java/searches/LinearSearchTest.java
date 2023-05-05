package searches;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinearSearchTest {

    //Test case for successful search
    @Test
    public void testFind() {
        LinearSearch search = new LinearSearch();
        Integer[] array = {1, 6, 8, 3, 9, 2};
        int expectedIndex = 2;
        int actualIndex = search.find(array, 8);
        assertEquals(expectedIndex, actualIndex);
    }

    //Test case for unsuccessful search
    @Test
    public void testFindNotFound() {
        LinearSearch search = new LinearSearch();
        String[] array = {"apple", "banana", "orange"};
        int expectedIndex = -1;
        int actualIndex = search.find(array, "grape");
        assertEquals(expectedIndex, actualIndex);
    }

    //Test case for searching an empty array
    @Test
    public void testFindEmptyArray() {
        LinearSearch search = new LinearSearch();
        String[] array = {};
        int expectedIndex = -1;
        int actualIndex = search.find(array, "apple");
        assertEquals(expectedIndex, actualIndex);
    }

    //Test case for searching null value
    @Test
    public void testFindNullValue() {
        LinearSearch search = new LinearSearch();
        Integer[] array = {1, 6, 8, 3, 9, 2};
        int expectedIndex = -1;
        int actualIndex = search.find(array, null);
        assertEquals(expectedIndex, actualIndex);
    }

}