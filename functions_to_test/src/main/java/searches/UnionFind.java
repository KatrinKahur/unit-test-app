package searches;

import java.util.*;

public class UnionFind {

    private int[] p;
    private int[] r;

    public UnionFind(int n) {
        p = new int[n];
        r = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = i;
        }
    }

    public int find(int i) {
        int parent = p[i];

        if (i == parent) {
            return i;
        }

        return p[i] = find(parent);
    }

    public void union(int x, int y) {
        int r0 = find(x);
        int r1 = find(y);

        if (r1 == r0) {
            return;
        }

        if (r[r0] > r[r1]) {
            p[r1] = r0;
        } else if (r[r1] > r[r0]) {
            p[r0] = r1;
        } else {
            p[r1] = r0;
            r[r0]++;
        }
    }

    public int count() {
        List parents = new ArrayList();
        for (int i = 0; i < p.length; i++) {
            if (!parents.contains(find(i))) {
                parents.add(find(i));
            }
        }
        return parents.size();
    }

    public String toString() {
        return "p " + Arrays.toString(p) + " r " + Arrays.toString(r) + "\n";
    }
}
