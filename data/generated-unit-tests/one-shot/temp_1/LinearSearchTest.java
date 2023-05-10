
public class LinearSearchTest {
@Test
public void testFind() {
LinearSearch linearSearch = new LinearSearch();
Integer[] array = {3, 6, 8, 2, 1};
Assert.assertEquals(2, linearSearch.find(array, 8));
Assert.assertEquals(0, linearSearch.find(array, 3));
Assert.assertEquals(-1, linearSearch.find(array, 5));
String[] strArray = {"dog", "cat", "fish", "bird"};
Assert.assertEquals(3, linearSearch.find(strArray, "bird"));
Assert.assertEquals(1, linearSearch.find(strArray, "cat"));
Assert.assertEquals(-1, linearSearch.find(strArray, "snake"));
}
}