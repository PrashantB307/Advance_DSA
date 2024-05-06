

//   https://leetcode.com/problems/network-delay-time/description/

//   https://www.naukri.com/code360/problems/network-delay-time_1382215


import java.util.*;
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        Map<Integer, List<int[]>> adj = new HashMap<>();
        
        for (int[] vec : times) {
            int u = vec[0];
            int v = vec[1];
            int w = vec[2];
            adj.computeIfAbsent(u, x -> new ArrayList<>()).add(new int[] { v, w });
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        
        int[] result = new int[n + 1];
        Arrays.fill(result, Integer.MAX_VALUE);

        result[k] = 0;
        pq.offer(new int[] { 0, k });

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int d = top[0];
            int node = top[1];
            if (d > result[node])
                continue;

            for (int[] vec : adj.getOrDefault(node, new ArrayList<>())) {
                int adjNode = vec[0];
                int dist = vec[1];

                if (d + dist < result[adjNode]) {
                    result[adjNode] = d + dist;
                    pq.offer(new int[] { d + dist, adjNode });
                }
            }
        }

        int ans = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++)
            ans = Math.max(ans, result[i]);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}