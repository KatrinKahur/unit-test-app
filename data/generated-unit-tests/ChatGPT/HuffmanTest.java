package others;  
import org.junit.Test; 
import static org.junit.Assert.*;  
public class HuffmanTest {      
    @Test     
    public void testPrintCodeSingleCharacter() {         
        HuffmanNode node = new HuffmanNode();         
        node.c = 'A';         
        node.data = 5;        
        Huffman.printCode(node, "");         
        // check that the output is correct         
        // (in this case, there should only be one line)         
        assertEquals("A: ", systemOut().getHistory());     
        
    }      
    @Test     
    public void testPrintCodeMultipleCharacters() {         
        HuffmanNode root = new HuffmanNode();         
        root.left = new HuffmanNode();         
        root.right = new HuffmanNode();         
        root.left.c = 'A';         
        root.left.data = 5;         
        root.right.c = 'B';         
        root.right.data = 10;         
        Huffman.printCode(root, "");         
        // check that the output is correct         
        // (in this case, there should be two lines)         
        assertEquals("A: 0\nB: 1\n", systemOut().getHistory());     
        
    } 
    
}
