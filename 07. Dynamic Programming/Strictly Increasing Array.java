

//   https://www.geeksforgeeks.org/problems/convert-to-strictly-increasing-array3351/1


import java.util.*;
class Solution
{
    public int min_operations(int []nums)
    {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int ans = 1;

        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] - nums[j] >= i - j){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            ans = Math.max(ans, dp[i]);
        }

        return n - ans;
    }
}