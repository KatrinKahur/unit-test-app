
public class HuffmanTest {

    @Test
    public void testPrintCode() {
        HuffmanNode a = new HuffmanNode();
        a.c = 'a';
        a.data = 5;

        HuffmanNode b = new HuffmanNode();
        b.c = 'b';
        b.data = 9;

        HuffmanNode c = new HuffmanNode();
        c.c = 'c';
        c.data = 12;

        HuffmanNode d = new HuffmanNode();
        d.c = 'd';
        d.data = 13;

        HuffmanNode e = new HuffmanNode();
        e.c = 'e';
        e.data = 16;

        HuffmanNode f = new HuffmanNode();
        f.c = 'f';
        f.data = 45;

        // Construct Huffman tree
        HuffmanNode root = new HuffmanNode();
        root.data = a.data + b.data + c.data + d.data + e.data + f.data;
        root.left = b;
        root.right = f;

        b.left = c;
        b.right = d;

        c.left = a;

        f.left = e;

        // Test printCode method
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Huffman.printCode(root, "");
        String expectedOutput = "a:100\nb:00\nc:1010\nd:1011\ne:01\nf:11\n";
        Assert.assertEquals(expectedOutput, outContent.toString());
    }
}