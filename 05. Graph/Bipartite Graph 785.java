

//   https://www.geeksforgeeks.org/problems/bipartite-graph/1


import java.util.*;
class Solution
{
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int[] color = new int[V];

        Arrays.fill(color, -1);

        for(int i = 0; i < V; i++){
            if(color[i] == -1){
                if(dfs(i, 0, color, adj) == false){
                    return false;
                }
            }
        }

        return true;
    }

    boolean dfs(int i, int col, int[] color, ArrayList<ArrayList<Integer>>adj){

        color[i] = col;

        for(int j : adj.get(i)){
            if(color[j] == -1){
                if(dfs(j, 1 - col , color, adj) == false){
                    return false;
                }
            }else if(color[j] == col){
                return false;
            }
        }

        return true;
    }
}