

//    https://www.geeksforgeeks.org/problems/number-of-good-components--170647/1


import java.util.*;
class Solution {

    static int v_count;
    static int e_count;
    static boolean vis[];

    public static int findNumberOfGoodComponent(int e, int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]); 
        }

        vis = new boolean[V + 1];
        int ans = 0;

        for (int i = 1; i <= V; i++) {
            if (!vis[i]) {
                v_count = e_count = 0;
                dfs(adj, i);

                if (e_count == (v_count * (v_count - 1))){
                    ans++;
                }
            }
        }

        return ans;
    }

    static void dfs(ArrayList<ArrayList<Integer>> adj, int st) {
        vis[st] = true;
        v_count++;
        e_count += adj.get(st).size();

        for (int nei : adj.get(st)) {
            if (!vis[nei]){
                dfs(adj, nei);
            }
        }
    }
}