import org.junit.Test; 
import static org.junit.Assert.*;  
public class AlphabeticalTest {     
    @Test    
    public void testIsAlphabeticalWithEmptyString() {       
        boolean result = Alphabetical.isAlphabetical("");       
        assertTrue(result);    
        
    }     
    @Test    
    public void testIsAlphabeticalWithSingleCharacter() {       
        boolean result = Alphabetical.isAlphabetical("a");       
        assertTrue(result);    
        
    }     
    @Test    
    public void testIsAlphabeticalWithMultipleCharacters() {       
        boolean result = Alphabetical.isAlphabetical("abcde");       
        assertTrue(result);    
        
    }     
    @Test    
    public void testIsAlphabeticalWithMixedCaseCharacters() {       
        boolean result = Alphabetical.isAlphabetical("AbCdEf");       
        assertTrue(result);    
    }    
    @Test    
    public void testIsAlphabeticalWithNonAlphabeticCharacters() {       
        boolean result = Alphabetical.isAlphabetical("a1b2c3");       
        assertFalse(result);    
        
    }     
    @Test    
    public void testIsAlphabeticalWithCharactersInNonAlphabeticalOrder() {       
        boolean result = Alphabetical.isAlphabetical("dcba");       
        assertFalse(result);    
    } 
}
