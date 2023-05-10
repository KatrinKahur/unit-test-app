
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.PriorityQueue;

public class HuffmanTest {

    @Test
    public void testPrintCode() {
        // Create huffman tree
        HuffmanNode root = new HuffmanNode();
        root.data = 5;
        root.left = new HuffmanNode();
        root.left.data = 2;
        root.right = new HuffmanNode();
        root.right.data = 3;
        root.left.left = new HuffmanNode();
        root.left.left.data = 1;
        root.left.right = new HuffmanNode();
        root.left.right.data = 1;

        // Test printCode method
        Huffman.printCode(root, "");
        // Expected output: 
        // a:00
        // b:01
        // c:1
    }

    @Test
    public void testMyComparator() {
        // Create priority queue with huffman nodes
        PriorityQueue<HuffmanNode> queue = new PriorityQueue<>(new MyComparator());
        HuffmanNode node1 = new HuffmanNode();
        node1.data = 5;
        HuffmanNode node2 = new HuffmanNode();
        node2.data = 3;
        HuffmanNode node3 = new HuffmanNode();
        node3.data = 1;
        queue.add(node1);
        queue.add(node2);
        queue.add(node3);

        // Test MyComparator method
        HuffmanNode first = queue.poll();
        assertEquals(first.data, 1);
        HuffmanNode second = queue.poll();
        assertEquals(second.data, 3);
        HuffmanNode third = queue.poll();
        assertEquals(third.data, 5);
    }
}