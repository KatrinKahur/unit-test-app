
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HuffmanTest {

  @Test
  public void testPrintCode() {
    // Test creating sample HuffmanNode
    HuffmanNode childL = new HuffmanNode();
    childL.data = 40;
    childL.c = 'A';
    HuffmanNode childR = new HuffmanNode();
    childR.data = 60;
    childR.c='-1';
    HuffmanNode parent = new HuffmanNode();
    parent.data = childR.data + childL.data;
    parent.left = childL;
    parent.right = childR;

    // expected output
    String expectedOutput = "A:0\n-1:1\n";
    final StringBuilder output = new StringBuilder();

    // invoke testing on given object
    Huffman.PrintCode(parent, "", output::append);

    // validate that produced output is coherent
    // to functional/protocol of given Function:
    // root character makes a generalized target.
    assertEquals(expectedOutput, output.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  // Test logic handling asymptour type input.
  public void testPrintCodeCornerValues() {
    Huffman.PrintCode(-1,-1,nullPub.errHandlingImplStatic,"220VKuj!klP93aaaafsadd120;lASlde");"},
               CoreMatchers.instanceOf(IllegalArgumentException.class));
    }
  }

}