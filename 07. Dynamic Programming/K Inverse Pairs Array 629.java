

//   https://leetcode.com/problems/k-inverse-pairs-array/


class Solution {
    int mod = 1000000007;
    Integer[][] dp = new Integer[1001][1001];
    public int kInversePairs(int n, int k) {
        if(n == 0){
            return 0;
        }

        if(k == 0){
            return 1;
        }

        if(dp[n][k] != null){
            return dp[n][k];
        }
        int pairs = 0;
        for(int i = 0; i <= Math.min(k, n - 1); i++){
            pairs = (pairs + kInversePairs(n - 1, k - i)) % mod;
        } 

        dp[n][k] = pairs;

        return pairs;

    }
}