

//   https://www.geeksforgeeks.org/problems/shortest-path-in-undirected-graph-having-unit-distance/1


import java.util.*;
class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=  0; i < n; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        int[] dist = new int[n];
        for(int i = 0; i < n; i++){
            dist[i] = Integer.MAX_VALUE;
        }

        dist[src] = 0;

        Queue<Integer> q = new LinkedList<>();
        q.add(src);

        while (q.size() > 0) {
            int node = q.remove();

            for(int val : adj.get(node)){
                if(dist[node] + 1 < dist[val]){
                    dist[val] = dist[node] + 1;
                    q.add(val);
                }
            }
        }

        for(int i = 0;  i < n; i++){
            if(dist[i] == Integer.MAX_VALUE){
                dist[i] = -1;
            }
        }

        return dist;
    }
}