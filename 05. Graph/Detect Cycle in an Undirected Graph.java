

//   https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1


//=====================================>   BFS   <========================================

import java.util.*;
class Solution {
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        
        boolean[] vis = new boolean[V];

        for(int i = 0; i < V; i++){
            if(vis[i] == false){
                boolean flag = findCycle(i, adj, vis);
                if(flag == true){
                    return true;
                }
            }
        }
        return false;
    }

    boolean findCycle(int i, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(i);

        while (dq.size() > 0) {
            int rem = dq.remove();
            if(vis[rem]){
                return true;
            }

            vis[rem] = true;

            for(int nbr : adj.get(rem)){
                if(vis[nbr] == false){
                    dq.add(nbr);
                }
            }
        }
        
        return false;
    }
}

//=====================================>   DFS   <========================================

class Solution2 {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        
        for(int i = 0; i < V; i++){
            if(vis[i] == false){
                if(helper(i, -1, vis, adj) == true){
                    return true;
                }
            }
        }
        
        return false;
    }
    
     public boolean helper(int i, int par, boolean[] vis, ArrayList<ArrayList<Integer>> adj) {
         
        vis[i] = true;
        
        for(int nbr : adj.get(i)){
            if(vis[nbr] == false){
                if(helper(nbr, i, vis, adj) == true){
                    return true;
                }
            }else if(nbr != par){
                return true;
            }
        }
        
        return false;
     }
}