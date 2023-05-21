
public class HuffmanTest {

@Test
public void testPrintCode() {
HuffmanNode root = new HuffmanNode();
root.data = 5;
root.c = 'a';

HuffmanNode left = new HuffmanNode();
left.data = 2;
left.c = 'b';

HuffmanNode right = new HuffmanNode();
right.data = 3;
right.c = 'c';

root.left = left;
root.right = right;

Huffman.printCode(root, "");

// Verify that the output is correct
// for each leaf node
Assert.assertEquals("a:0", systemOutRule.getLog().split("\n")[0]);
Assert.assertEquals("b:10", systemOutRule.getLog().split("\n")[1]);
Assert.assertEquals("c:11", systemOutRule.getLog().split("\n")[2]);
}
}