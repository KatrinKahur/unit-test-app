
public class HuffmanTest {

    @Test
    public void testPrintCode() {
        HuffmanNode root = new HuffmanNode();
        root.data = 5;
        HuffmanNode left = new HuffmanNode();
        left.c = 'A';
        left.data = 2;
        HuffmanNode right = new HuffmanNode();
        right.c = 'B';
        right.data = 3;
        root.left = left;
        root.right = right;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Huffman.printCode(root, "");

        String expectedOutput = "A:0\nB:1\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMyComparator() {
        MyComparator comparator = new MyComparator();
        HuffmanNode node1 = new HuffmanNode();
        HuffmanNode node2 = new HuffmanNode();
        node1.data = 5;
        node2.data = 3;
        assertTrue(comparator.compare(node1, node2) > 0);

        node1.data = 3;
        node2.data = 5;
        assertTrue(comparator.compare(node1, node2) < 0);

        node1.data = 3;
        node2.data = 3;
        assertTrue(comparator.compare(node1, node2) == 0);
    }

}