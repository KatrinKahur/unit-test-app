
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.PriorityQueue;

public class HuffmanTest {
  
    @Test
    public void testPrintCode() {
        // create sample Huffman tree
        HuffmanNode root = new HuffmanNode();
        root.data = 5;

        HuffmanNode left = new HuffmanNode();
        left.data = 2;
        left.c = 'a';

        HuffmanNode right = new HuffmanNode();
        right.data = 3;
        right.c = 'b';

        root.left = left;
        root.right = right;

        // test printing codes
        Huffman.printCode(root, "");
        assertEquals("a:0\nb:1\n", outContent.toString());
    }

    @Test
    public void testComparator() {
        // create sample nodes and comparator
        HuffmanNode node1 = new HuffmanNode();
        node1.data = 5;

        HuffmanNode node2 = new HuffmanNode();
        node2.data = 2;

        MyComparator comparator = new MyComparator();

        // test comparator
        assertTrue(comparator.compare(node1, node2) > 0);
        assertTrue(comparator.compare(node2, node1) < 0);
        assertEquals(0, comparator.compare(node1, node1));
    }

}