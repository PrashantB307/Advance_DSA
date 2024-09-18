

//    https://www.geeksforgeeks.org/problems/cutted-segments1642/1

//    https://www.naukri.com/code360/problems/cut-into-segments_1214651


import java.util.*;
class Solution {
    public int maximizeCuts(int n, int x, int y, int z) {
        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);
        
        int ans = findMax(n, dp, x, y, z);

        return ans < 0 ? 0 : ans;
    }

    public int findMax(int n, int[] dp, int x, int y, int z){
        if(n == 0){
            return 0;
        }

        if(n < 0){
            return Integer.MIN_VALUE;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int a = findMax(n - x, dp, x, y, z);
        int b = findMax(n - y, dp, x, y, z);
        int c = findMax(n - z, dp, x, y, z);

        int ans = Math.max(a, Math.max(b, c));

        dp[n] = ans + 1;

        return dp[n];
    }
}