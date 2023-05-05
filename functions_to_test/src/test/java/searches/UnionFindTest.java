package searches;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnionFindTest {

    @Test
    public void testFind() {
        UnionFind uf = new UnionFind(10);
        assertEquals(0, uf.find(0));
        assertEquals(1, uf.find(1));
        uf.union(0, 1);
        assertEquals(0, uf.find(1));
    }

    @Test
    public void testUnion() {
        UnionFind uf = new UnionFind(10);
        uf.union(0, 1);
        assertEquals(1, uf.find(0));
        uf.union(2, 3);
        uf.union(0, 3);
        assertEquals(1, uf.find(3));
    }

    @Test
    public void testCount() {
        UnionFind uf = new UnionFind(10);
        uf.union(0, 1);
        uf.union(2, 3);
        assertEquals(8, uf.count());
        uf.union(1, 2);
        assertEquals(7, uf.count());
    }
}