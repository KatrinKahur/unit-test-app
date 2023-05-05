package strings;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PermuteStringTest {

    //Test for correct swapping
    @Test
    public void testSwapString() {
        assertEquals("bac", PermuteString.swapString("abc", 0, 1));
    }

    //Test for generating permutations of given string
    @Test
    public void testGeneratePermutation() {
        String str = "abc";
        PermuteString.generatePermutation(str, 0, str.length());
        //Assert output contains all permutations
        assertTrue("abc\nacb\nbac\nbca\ncba\ncab\n".equalsIgnoreCase(systemOutput()));
    }

    //Helper method to capture the system output
    private String systemOutput() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        return output.toString();
    }
}