

//  https://www.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1


import java.util.*;
class Solution {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        boolean[] dfs = new boolean[V];
        
         boolean flag = false;

        for(int i = 0; i < V; i++){
            if(vis[i] == false){
                flag = findCycle(i, adj, vis, dfs, flag);
                if(flag == true){
                    return true;
                }
            }
        }

        return flag;
    }

    boolean findCycle(int curr, ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] dfs, boolean flag){
        
        vis[curr] = true;
        dfs[curr] = true;
        
        for(int i = 0; i < adj.get(curr).size(); i++){
            int val = adj.get(curr).get(i);
            if(!vis[val]){
                flag = findCycle(val, adj, vis, dfs, flag);
                if(flag){
                    return true;
                }
            }else if(dfs[val]){
                return true;
            }
        }
        
        dfs[curr] = false;
        
        return false;
    }
}


// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX=====>   Using Topological Sorting   <====XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

class Solution2 {
  
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] in = new int[V];
        
        for(int i = 0; i < V; i++){
            for(int nbr : adj.get(i)){
                in[nbr]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < V; i++){
            if(in[i] == 0){
                q.add(i);
            }
        }
        
        int cnt = 0;
    
        
        while(q.size() > 0){
            int node = q.remove();
            cnt++;
            
            for(int nbr : adj.get(node)){
                in[nbr]--;
                if(in[nbr] == 0){
                    q.add(nbr);
                }
            }
        }
        
        if(cnt == V){
            return false;
        }
        
        return true;
    }
}