

//   https://leetcode.com/problems/number-of-provinces/

//   https://www.geeksforgeeks.org/problems/number-of-provinces/1



import java.util.*;
class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int cnt = 0;

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                cnt++;
                dfs(isConnected, n, i, visited);
            }
        }

        return cnt;
    }

    public void dfs(int[][] adj, int n, int i, boolean[] visited){

        visited[i] = true;

        for(int j = 0; j < n; j++){
            if(adj[i][j] == 1 && !visited[j]){
                dfs(adj, n, j, visited);
            }
        }
    }
}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXXX=============>   GFG    <============XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int v) {
        int n = adj.size();
        int[][] adjMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = adj.get(i);
            for (int j = 0; j < n; j++) {
                adjMatrix[i][j] = row.get(j);
            }
        }
        
        boolean[] visited = new boolean[n];
        int cnt = 0;

        for(int i = 0; i < v; i++){
            if(!visited[i]){
                cnt++;
                dfs(adjMatrix, v, i, visited);
            }
        }

        return cnt;
    }

    static void dfs(int[][] adjMatrix, int v, int i, boolean[] visited){

        visited[i] = true;

        for(int j = 0; j < v; j++){
            if(adjMatrix[i][j] == 1 && !visited[j]){
                dfs(adjMatrix, v, j, visited);
            }
        }
    }
}