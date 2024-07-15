

//   https://www.geeksforgeeks.org/problems/divisibility-tree1902/1


import java.util.*;
class Solution {

    int cnt;
    public int minimumEdgeRemove(int n, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        cnt = 0;

        for(int i = 0; i <= n; i++){
            list.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            list.get(u).add(v);
            list.get(v).add(u);
        }

        boolean[] visited = new boolean[n + 1];

        for(int i = 1; i <= n; i++){
            if(visited[i] == false){
                helper(list, visited, i);
            }
        }

        return cnt;
    }

    public int helper(ArrayList<ArrayList<Integer>> list, boolean[] visited, int i){
        visited[i] = true;
        int size = 1;

        for(int n : list.get(i)){
            if(visited[n] == false){
                int val = helper(list, visited, n);
                size += val;
                if(val % 2 == 0){
                    cnt++;
                }
            }
        }

        return size;
    }
}
