
package searches;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class FibonacciSearchTest {

    @Test
    public void testEmptyArray() {
        Integer[] arr = new Integer[0];
        FibonacciSearch fs = new FibonacciSearch();
        assertEquals(-1, fs.find(arr, 5));
    }

    @Test
    public void testOneElementArray() {
        Integer[] arr = new Integer[]{5};
        FibonacciSearch fs = new FibonacciSearch();
        assertEquals(0, fs.find(arr, 5));
        assertEquals(-1, fs.find(arr, 6));
    }

    @Test
    public void testArrayWithRepeatedValues() {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10};
        FibonacciSearch fs = new FibonacciSearch();
        assertEquals(4, fs.find(arr, 5));
        assertEquals(5, fs.find(arr, 5));
        assertEquals(6, fs.find(arr, 5));
    }

    @Test
    public void testArrayWithNegativeValues() {
        Integer[] arr = new Integer[]{-10, -5, 0, 5, 10, 15};
        FibonacciSearch fs = new FibonacciSearch();
        assertEquals(3, fs.find(arr, 5));
        assertEquals(-1, fs.find(arr, 6));
    }

    @Test
    public void testArrayWithStrings() {
        String[] arr = new String[]{"apple", "banana", "cherry", "date", "elderberry"};
        FibonacciSearch fs = new FibonacciSearch();
        assertEquals(1, fs.find(arr, "banana"));
        assertEquals(-1, fs.find(arr, "kiwi"));
    }

    @Test
    public void testArrayWithCustomObjects() {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 30);
        Student s3 = new Student("Charlie", 25);
        Student[] arr = new Student[]{s1, s2, s3};
        FibonacciSearch fs = new FibonacciSearch();
        assertEquals(1, fs.find(arr, s2));
        assertFalse(fs.find(arr, s1) == 2);
        assertTrue(fs.find(arr, new Student("David", 40)) == -1);
    }
}

class Student implements Comparable<Student> {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student s) {
        return this.age - s.age;
    }
}