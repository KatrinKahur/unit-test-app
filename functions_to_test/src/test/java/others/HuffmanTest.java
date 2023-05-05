package others;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HuffmanTest{
    @Test
    public void testPrintCodeLeafNode() {
        HuffmanNode node = new HuffmanNode();
        node.c = 'a';
        node.data = 5;
        Huffman.printCode(node, "");
        // expected output: "a: "
    }

    @Test
    public void testPrintCodeNonLeafNode() {
        HuffmanNode node1 = new HuffmanNode();
        node1.c = 'a';
        node1.data = 5;
        HuffmanNode node2 = new HuffmanNode();
        node2.c = 'b';
        node2.data = 2;
        HuffmanNode root = new HuffmanNode();
        root.left = node1;
        root.right = node2;
        Huffman.printCode(root, "");
        // expected output: "a: 0", "b: 1"
    }

    @Test
    public void testCompare() {
        HuffmanNode node1 = new HuffmanNode();
        node1.c = 'a';
        node1.data = 5;
        HuffmanNode node2 = new HuffmanNode();
        node2.c = 'b';
        node2.data = 2;
        MyComparator comparator = new MyComparator();
        int result = comparator.compare(node1, node2);
        assertEquals(-3, result);
    }

    // additional test for edge case with empty tree
    @Test
    public void testPrintCodeEmptyTree() {
        HuffmanNode root = new HuffmanNode();
        Huffman.printCode(root, "");
        // expected output: no output should be printed
    }
}