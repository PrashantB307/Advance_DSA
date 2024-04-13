

//   https://www.geeksforgeeks.org/problems/count-digit-groupings-of-a-number1520/1


import java.util.*;
class Solution
{
    int[][] dp;
    public int TotalCount(String str)
    {
        int n = str.length();
        dp = new int[n][901];
        for(int[] val : dp){
            Arrays.fill(val, -1);
        }

        return helper(str, 0, 0);
    }

    public int helper(String str, int idx, int preSum){
        if(idx == str.length()){
            return 1;
        }

        if(dp[idx][preSum] != -1){
            return dp[idx][preSum];
        }

        int currSum = 0, ans = 0;

        for(int i = idx; i < str.length(); i++){
            currSum += str.charAt(i) - '0';
            if(currSum >= preSum){
                ans += helper(str, i + 1, currSum);
            }
        }

        dp[idx][preSum] = ans;

        return dp[idx][preSum];
    }
}