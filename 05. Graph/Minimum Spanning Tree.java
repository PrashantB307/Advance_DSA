

//  https://www.geeksforgeeks.org/problems/minimum-spanning-tree/1


import java.util.*;
class Solution {
    static class Pair {
        int wgt;
        int node;

        Pair(int wgt, int node) {
            this.wgt = wgt;
            this.node = node;
        }
    }
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a, b) -> (a.wgt - b.wgt));
        int[] vis = new int[V];
        pq.add(new Pair(0 , 0));
        int sum = 0;
        
        while(pq.size() > 0){
            Pair curr = pq.remove();
            int wt = curr.wgt;
            int node = curr.node;
            
            if(vis[node] == 1){
                continue;
            }
            vis[node] = 1;
            sum += wt;
            
            for(int i = 0; i < adj.get(node).size(); i++){
                int nwt = adj.get(node).get(i)[1];
                int nnode = adj.get(node).get(i)[0];
                
                if(vis[nnode] == 0){
                    pq.add(new Pair(nwt, nnode));
                }
            }
        }
        
        return sum;
    }
}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX====>   OLD Version   <====XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {

    static class Pair {
        int wgt;
        int node;

        Pair(int wgt, int node) {
            this.wgt = wgt;
            this.node = node;
        }
    }

    static int spanningTree(int V, int E, int edges[][]) {

        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
        
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<ArrayList<Integer>>());
        }

        // making undirected graph in form of adjoint list:

        for (int i = 0; i < E; i++) {
            int u = edges[i][0];
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(edges[i][1]);
            temp.add(edges[i][2]);
            adj.get(u).add(temp);

            int v = edges[i][1];
            ArrayList<Integer> temp2 = new ArrayList<>();
            temp2.add(edges[i][0]);
            temp2.add(edges[i][2]);
            adj.get(v).add(temp2);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.wgt - b.wgt);
        int[] visited = new int[V];

        pq.add(new Pair(0, 0));
        int sum = 0;

        while (pq.size() > 0) {
            int wgt = pq.peek().wgt;
            int node = pq.peek().node;
            pq.remove();

            if (visited[node] == 1) {
                continue;
            }

            visited[node] = 1;
            sum += wgt;

            for (ArrayList<Integer> list : adj.get(node)) {
                int adjWgt = list.get(1);
                int adjNode = list.get(0);

                if (visited[adjNode] == 0) {
                    pq.add(new Pair(adjWgt, adjNode));
                }
            }
        }

        return sum;
    }
}