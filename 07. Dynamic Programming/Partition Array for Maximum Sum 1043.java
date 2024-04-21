

//    https://leetcode.com/problems/partition-array-for-maximum-sum/

//    https://www.geeksforgeeks.org/problems/partition-array-for-maximum-sum/1


import java.util.*;
class Solution {
    int[] dp;
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        dp = new int[n];
        Arrays.fill(dp, -1);

        return helper(arr, k, 0);
    }

    int helper(int[] arr, int k, int st){
        int len = arr.length;
        if(st >= len){
            return 0;
        }

        if(dp[st] != -1){
            return dp[st];
        }

        int currMax = 0;
        int ans = 0;
        int end = Math.min(len, st + k);

        for(int i = st; i < end; i++){
            currMax = Math.max(currMax, arr[i]);
            ans = Math.max(ans, currMax * (i - st + 1) + helper(arr, k, i + 1));
        }
        dp[st] = ans;
        
        return dp[st];
    }
}