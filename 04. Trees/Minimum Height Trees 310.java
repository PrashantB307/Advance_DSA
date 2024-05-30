

//   https://leetcode.com/problems/minimum-height-trees/


import java.util.*;
class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        
        List<Integer> list = new ArrayList<>();
        
        if(n <= 0){
            return list;
        }

        if(n == 1){
            list.add(0);
            return list;
        }

        int[] degree = new int[n];
        
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            degree[edge[0]]++;
            degree[edge[1]]++;

            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            if(degree[i] == 1){
                q.add(i);
            }
        }

        while (n > 2) {
            int size = q.size();
            n -= size;

            while (size-- > 0) {
                int v = q.poll();

                for(int i : adj.get(v)){
                    degree[i]--;
                    if(degree[i] == 1){
                        q.add(i);
                    }
                }
            }
        }

        list.addAll(q);
        return list;
    }
}