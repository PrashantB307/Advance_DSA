

//  https://www.geeksforgeeks.org/problems/max-sum-without-adjacents--170645/1


class Solution {
    int findMaxSum(int arr[], int n) {
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = arr[0];
        
        for(int i = 2;i < n + 1; ++i) {
            int incl = arr[i - 1] + dp[i - 2];
            int excl = dp[i - 1];
            dp[i] = Math.max(incl, excl);
        }
        
        return dp[n];
    }
}