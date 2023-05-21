
import org.junit.Test;
import static org.junit.Assert.*;

public class HuffmanTest {

    @Test
    public void testPrintCodeSingleNode() {
        HuffmanNode node = new HuffmanNode();
        node.data = 5;
        node.c = 'a';
        Huffman.printCode(node, "");
        // expected output: "a: "
    }

    @Test
    public void testPrintCodeMultipleNodes() {
        HuffmanNode node1 = new HuffmanNode();
        node1.data = 5;
        node1.c = 'a';
        HuffmanNode node2 = new HuffmanNode();
        node2.data = 3;
        node2.c = 'b';
        HuffmanNode node3 = new HuffmanNode();
        node3.data = 2;
        node3.c = 'c';
        node1.left = node2;
        node1.right = node3;
        Huffman.printCode(node1, "");
        // expected output: "a: 0", "b: 10", "c: 11"
    }

    @Test
    public void testPrintCodeEmptyTree() {
        HuffmanNode node = null;
        Huffman.printCode(node, "");
        // expected output: nothing printed
    }

    @Test
    public void testPrintCodeSameDataValues() {
        HuffmanNode node1 = new HuffmanNode();
        node1.data = 5;
        node1.c = 'a';
        HuffmanNode node2 = new HuffmanNode();
        node2.data = 5;
        node2.c = 'b';
        HuffmanNode node3 = new HuffmanNode();
        node3.data = 2;
        node3.c = 'c';
        node1.left = node2;
        node1.right = node3;
        Huffman.printCode(node1, "");
        // expected output: "a: 0", "b: 1", "c: 11"
    }

}