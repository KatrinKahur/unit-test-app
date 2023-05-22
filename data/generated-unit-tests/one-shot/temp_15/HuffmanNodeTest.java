
public class HuffmanTest {

    @Test
    public void testPrintCode() {
        //Sample Input
        HuffmanNode rootNode = new HuffmanNode();
        rootNode.data = 5;
        rootNode.left = new HuffmanNode();
        rootNode.left.c = 'a';
        rootNode.left.data = 2;
        rootNode.right = new HuffmanNode();
        rootNode.right.data = 3;
        rootNode.right.left = new HuffmanNode();
        rootNode.right.left.c = 'b';
        rootNode.right.left.data = 1;
        rootNode.right.right = new HuffmanNode();
        rootNode.right.right.c = 'c';
        rootNode.right.right.data = 2;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Huffman.printCode(rootNode, "");

        // Expected output of testing Huffman code "ABC" is 00 01 1.
        String expectedOutput = "a:0\nb:10\nc:11" + System.lineSeparator();
        Assert.assertEquals(expectedOutput, outContent.toString());
    }
}