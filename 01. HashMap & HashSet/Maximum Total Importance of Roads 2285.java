

//   https://leetcode.com/problems/maximum-total-importance-of-roads


import java.util.*;
class Solution {
    public long maximumImportance(int n, int[][] roads) {
        
        long[] degree = new long[n];

        for(int[] road : roads){
            degree[road[0]]++;
            degree[road[1]]++;
        }

        Arrays.sort(degree);
        long ans = 0;
        long cnt = 1;

        for(long d : degree){
            ans += d * cnt;
            cnt++;
        }

        return ans;
    }
}