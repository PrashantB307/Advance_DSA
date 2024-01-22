

//    https://leetcode.com/problems/total-cost-to-hire-k-workers/


import java.util.*;
class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        long ans = 0;

        int hired = 0;
        int i = 0;
        int j = n - 1;

        while (hired < k) {
            while (pq1.size() < candidates && i <= j)
                pq1.offer(costs[i++]);
            while (pq2.size() < candidates && j >= i)
                pq2.offer(costs[j--]);

            int a = !pq1.isEmpty() ? pq1.peek() : Integer.MAX_VALUE;
            int b = !pq2.isEmpty() ? pq2.peek() : Integer.MAX_VALUE;

            if (a <= b) {
                ans += a;
                pq1.poll();
            } else {
                ans += b;
                pq2.poll();
            }

            hired++;
        }

        return ans;
    }
}