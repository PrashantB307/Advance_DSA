

//   https://www.geeksforgeeks.org/problems/introduction-to-dp/1


import java.util.*;
class Solution {
    static long[] dp;
    static long mod = 1000000007;

    public Solution(){
        dp = new long[10001];
        Arrays.fill(dp, -1);

    }
    static long topDown(int n) {
        
        if(n <= 1){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = (topDown(n - 1) % mod + topDown(n - 2) % mod) % mod;

        return dp[n];
    }

    static long bottomUp(int n) {
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
        }

        return dp[n] % mod;
    }
}
