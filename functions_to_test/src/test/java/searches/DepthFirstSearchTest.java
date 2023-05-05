package searches;

import static searches.DepthFirstSearch.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class DepthFirstSearchTest {
    private DepthFirstSearch.Node node;

    @Before
    public void setup() {
        node = new DepthFirstSearch.Node("root", new ArrayList<>());
        DepthFirstSearch.Node child1 = new DepthFirstSearch.Node("child1", new ArrayList<>());
        DepthFirstSearch.Node child2 = new DepthFirstSearch.Node("child2", new ArrayList<>());
        DepthFirstSearch.Node grandchild1 = new DepthFirstSearch.Node("grandchild1", new ArrayList<>());
        node.getSubNodes().add(child1);
        node.getSubNodes().add(child2);
        child1.getSubNodes().add(grandchild1);
    }

    @Test
    public void testSearch() {
        Optional<DepthFirstSearch.Node> result = DepthFirstSearch.search(node, "root");
        assertTrue(result.isPresent());
        assertEquals(result.get().getName(), "root");

        result = DepthFirstSearch.search(node, "child1");
        assertTrue(result.isPresent());
        assertEquals(result.get().getName(), "child1");

        result = DepthFirstSearch.search(node, "child2");
        assertTrue(result.isPresent());
        assertEquals(result.get().getName(), "child2");

        result = DepthFirstSearch.search(node, "grandchild1");
        assertTrue(result.isPresent());
        assertEquals(result.get().getName(), "grandchild1");

        result = DepthFirstSearch.search(node, "nonExistentNode");
        assertFalse(result.isPresent());
    }

    @Test
    public void testAssertThat() {
        assertThat("Hello world", "Hello world");
        assertThat(42, 42);
        assertThat(3.14, 3.14);
        assertThat(true, true);
        // Testing failure case
        try {
            assertThat("Hello", "World");
            fail("Expected AssertionError to be thrown");
        } catch (AssertionError ae) {
            assertEquals("expected=World but was actual=Hello", ae.getMessage());
        }
    }
}