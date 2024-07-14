

//    https://leetcode.com/problems/all-ancestors-of-a-node-in-a-directed-acyclic-graph


import java.util.*;
class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            ans.add(new ArrayList<>());
            list.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            list.get(edge[0]).add(edge[1]);
        }

        for(int i = 0; i < n; i++){
            boolean[] visited = new boolean[n];

            dfs(i, list, visited);

            for(int j = 0; j < n; j++){
                if(i == j){
                    continue;
                }

                if(visited[j]){
                    ans.get(j).add(i);
                }
            }
        }

        return ans;
    }

    public void dfs(int i , List<List<Integer>> list, boolean[] visited){
        visited[i] = true;

        for(int j = 0; j < list.get(i).size(); j++){
            int nbr = list.get(i).get(j);

            if(visited[nbr]){
                continue;
            }

            dfs(nbr, list, visited);
        }
    }
}