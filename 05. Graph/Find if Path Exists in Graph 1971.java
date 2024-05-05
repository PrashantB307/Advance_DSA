

//   https://leetcode.com/problems/find-if-path-exists-in-graph/


import java.util.*;
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            map.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            map.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        Set<Integer> set = new HashSet<>();

        return dfs(source, destination, map, set);
    }

    public boolean dfs(int src, int dest, HashMap<Integer, List<Integer>> map, Set<Integer> set){
        if(src == dest){
            return true;
        }

        set.add(src);

        for(int node : map.getOrDefault(src, new ArrayList<>())){
            if(!set.contains(node)){
                if(dfs(node, dest, map, set)){
                    return true;
                }
            }
        }

        return false;
    }
}