

//  https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
  

import java.util.*;
class Solution {
    
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        boolean visited[] = new boolean[V];

        dfsHelper(0, visited, adj, ans);
        
        return ans;
    }

    public void dfsHelper(int node, boolean visited[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans) {
        visited[node] = true;
        ans.add(node);
        
        for (int x : adj.get(node)) {
            if (visited[x] == false) {
                dfsHelper(x, visited, adj, ans);
            }
        }

    }
}