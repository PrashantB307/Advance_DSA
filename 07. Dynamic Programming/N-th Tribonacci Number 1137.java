

//    https://leetcode.com/problems/n-th-tribonacci-number/

//    https://www.codingninjas.com/studio/problems/tribonacci-sequence_3929491


class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n + 3];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        int i = 3;
        while(i <= n){
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            i++;
        }

        return dp[n];
    }
}