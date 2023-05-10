
(1) 
@Test 
public void testPrintCode() {
    HuffmanNode root = new HuffmanNode();
    root.data = 5;
    HuffmanNode left = new HuffmanNode();
    left.c = 'a';
    left.data = 2;
    HuffmanNode right = new HuffmanNode();
    right.c = 'b';
    right.data = 3;
    root.left = left;
    root.right = right;
    Huffman.printCode(root, "");
    // expected output: a:0, b:1
}

(2) 
@Test 
public void testMyComparator() {
    MyComparator comparator = new MyComparator();
    HuffmanNode node1 = new HuffmanNode();
    node1.data = 3;
    HuffmanNode node2 = new HuffmanNode();
    node2.data = 2;
    assertEquals(1, comparator.compare(node1, node2)); // node1 > node2
}

(3) 
@Test 
public void testPrintCodeNoLeaf() {
     HuffmanNode root = new HuffmanNode();
     root.data = 5;
     root.left = new HuffmanNode();
     root.left.data = 3;
     root.right = new HuffmanNode();
     root.right.data = 2;
     Huffman.printCode(root, "");
     // expected output: no output
}

(4) 
@Test 
public void testPrintCodeNonLetter() {
     HuffmanNode root = new HuffmanNode();
     root.data = 2;
     root.c = '1';
     Huffman.printCode(root, "");
     // expected output: no output
}