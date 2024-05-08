

//    https://www.geeksforgeeks.org/problems/vertex-cover/1


import java.util.*;
class Solution {
    public static int vertexCover(int n, int m, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(n + 1);

        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] x : edges){
            adj.get(x[0]).add(x[1]);
            adj.get(x[1]).add(x[0]);
        }

        int[] mm = new int[n + 1];

        Arrays.fill(mm, 0);

        int cnt = 0, taken = 0, v = 1;

        return helper(cnt, taken, v, n, m, adj, mm);
    }

    static int helper(int cnt, int taken, int v, int n, int m, ArrayList<ArrayList<Integer>> adj, int[] mm){

        if(cnt == m){
            return taken;
        }

        if(v == n + 1){
            return Integer.MAX_VALUE;
        }

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        b = helper(cnt, taken, v + 1, n, m, adj, mm);
        cnt += adj.get(v).size();

        for(Integer x : adj.get(v)){
            if(mm[x] != 0){
                cnt--;
            }
        }

        mm[v]++;
        a = helper(cnt, taken + 1, v + 1, n, m, adj, mm);
        mm[v]--;

        return Math.min(a, b);
    }
}