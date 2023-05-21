
public class LinearSearchTest {

@Test
public void testFind() {
Integer[] array = {1, 2, 3, 4, 5};
LinearSearch search = new LinearSearch();
int result = search.find(array, 3);
Assert.assertEquals(2, result);
}

@Test
public void testFindNotFound() {
String[] array = {"apple", "banana", "orange"};
LinearSearch search = new LinearSearch();
int result = search.find(array, "grape");
Assert.assertEquals(-1, result);
}

@Test
public void testFindFirstElement() {
Double[] array = {3.14, 2.71, 1.62};
LinearSearch search = new LinearSearch();
int result = search.find(array, 3.14);
Assert.assertEquals(0, result);
}
}