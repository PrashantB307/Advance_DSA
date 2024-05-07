

//   https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero


import java.util.*;
class Solution {
    public int minReorder(int n, int[][] connections) {
        
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new ArrayList<>());
        }

        for(int[] c : connections){
            list.get(c[0]).add(c[1]);
            list.get(c[1]).add(-c[0]);
        }

        return dfs(list, new boolean[n], 0);
    }

    int dfs(List<List<Integer>> list, boolean[] visited, int from){
        int change = 0;
        visited[from] = true;

        for(int to : list.get(from)){
            if(!visited[Math.abs(to)]){
                change += dfs(list, visited, Math.abs(to)) + (to > 0 ? 1 : 0);
            }
        }

        return change;
    }
}