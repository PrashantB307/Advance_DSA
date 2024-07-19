

//  https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/


class Solution {
    public long maximumTotalCost(int[] nums) {
        
        int n = nums.length;
        long[] dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = nums[0];

        for(int i = 1 ; i < n; i++){
            dp[i + 1] = Math.max(dp[i] + nums[i], dp[i - 1] + nums[i - 1] - nums[i]);
        }

        return dp[n];
    }
}