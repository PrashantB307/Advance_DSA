
import java.util.*;
class Solution {

    static int[] parent;
    static int[] rank;

    public int detectCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        parent = new int[V];
        rank = new int[V];

        for (int i = 0; i < V; i++) {
            parent[i] = i;
        }

        for (int u = 0; u < V; u++) {
            for (int v : adj.get(u)) {
                if (u < v) {
                    if (find(v) == find(u)) {
                        return 1;
                    } else {
                        union(u, v);
                    }
                }
            }
        }

        return 0;
    }

    int find(int x) {
        if (parent[x] == x) {
            return x;
        } else {
            parent[x] = find(parent[x]);
            return parent[x];
        }
    }

    void union(int x, int y) {

        int xp = find(x);
        int yp = find(y);

        if (rank[xp] > rank[yp]) {
            parent[yp] = xp;
        } else if (rank[yp] > rank[xp]) {
            parent[xp] = yp;
        } else {
            parent[xp] = yp;
            rank[yp]++;
        }
    }
}