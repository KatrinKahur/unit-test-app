
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.PriorityQueue;

public class HuffmanTest {

    @Test
    public void testPrintCode() {
        // create a sample Huffman tree
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

        // test the printCode method
        String expectedOutput = "a:0\nb:1\n";
        assertEquals(expectedOutput, captureOutput(() -> Huffman.printCode(root, "")));
    }

    @Test
    public void testMyComparator() {
        // create a priority queue with some Huffman nodes
        PriorityQueue<HuffmanNode> queue = new PriorityQueue<>(new MyComparator());

        HuffmanNode node1 = new HuffmanNode();
        node1.data = 5;

        HuffmanNode node2 = new HuffmanNode();
        node2.data = 3;

        HuffmanNode node3 = new HuffmanNode();
        node3.data = 7;

        queue.add(node1);
        queue.add(node2);
        queue.add(node3);

        // test the MyComparator class
        assertEquals(node2, queue.poll());
        assertEquals(node1, queue.poll());
        assertEquals(node3, queue.poll());
    }

    // helper method to capture console output
    private String captureOutput(Runnable runnable) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream oldPrintStream = System.out;
        System.setOut(printStream);

        runnable.run();

        System.out.flush();
        System.setOut(oldPrintStream);
        return outputStream.toString();
    }
}