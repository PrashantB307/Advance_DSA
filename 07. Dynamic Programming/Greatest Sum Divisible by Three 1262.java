

//    https://leetcode.com/problems/greatest-sum-divisible-by-three/


import java.util.*;
class Solution {
    public int maxSumDivThree(int[] nums) {
        
        int n = nums.length;
        int[][] dp = new int[n + 1][3];

        for(int i = 0; i <= n; i++){
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }

        dp[0][0] = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                int rem = (j + nums[i]) % 3;

                dp[i + 1][rem] = Math.max(dp[i][rem], dp[i][j] + nums[i]);
            }
        }

        return dp[n][0];
    }
}