

//   https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1

//   https://www.codingninjas.com/studio/problems/bfs-in-graph_973002


import java.util.*;
class Solution {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int size = adj.size();
        boolean[] visited = new boolean[size];
        visited[0] = true;

        while (q.size() > 0) {
            int rem = q.remove();
            list.add(rem);

            for(int i = 0; i < adj.get(rem).size(); i++){
                int curr = adj.get(rem).get(i);
                if(!list.contains(curr) && visited[curr] == false){
                    q.add(curr);
                    visited[curr] = true;
                }
            }
        }

        return list;

    }
}