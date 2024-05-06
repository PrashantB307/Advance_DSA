

//   https://www.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1


import java.util.*;
class Solution
{
    static class Pair{
        int dist;
        int node;
    
        Pair(int dist, int node){
            this.dist = dist;
            this.node = node;
        }
    }

    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        int[] res = new int[V];

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);

        Arrays.fill(res, Integer.MAX_VALUE);
        
        res[S] = 0;
        pq.add(new Pair(0, S));

        while (pq.size() > 0) {
            int dist = pq.peek().dist;
            int node = pq.peek().node;
            pq.remove();

            for(int i = 0; i < adj.get(node).size(); i++){
                int adjDist = adj.get(node).get(i).get(0);
                int adjNode = adj.get(node).get(i).get(1);

                if(dist + adjDist < res[adjNode]){
                    res[adjNode] = dist + adjDist;

                    pq.add(new Pair(res[adjNode], adjNode));
                }
            }
        }

        return res;
    }
}
