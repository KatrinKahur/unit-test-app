
public class LinearSearchTest {
@Test
public void testFind() {
Integer[] array = {1, 2, 3, 4, 5};
LinearSearch linearSearch = new LinearSearch();
Assert.assertEquals(2, linearSearch.find(array, 3));
Assert.assertEquals(-1, linearSearch.find(array, 6));
}

@Test
public void testFindWithStrings() {
String[] array = {"apple", "banana", "orange", "pear"};
LinearSearch linearSearch = new LinearSearch();
Assert.assertEquals(1, linearSearch.find(array, "banana"));
Assert.assertEquals(-1, linearSearch.find(array, "grape"));
}

@Test
public void testFindWithEmptyArray() {
Integer[] array = {};
LinearSearch linearSearch = new LinearSearch();
Assert.assertEquals(-1, linearSearch.find(array, 3));
}

@Test
public void testFindWithNullValue() {
Integer[] array = {1, 2, 3, 4, 5};
LinearSearch linearSearch = new LinearSearch();
Assert.assertEquals(-1, linearSearch.find(array, null));
}
}