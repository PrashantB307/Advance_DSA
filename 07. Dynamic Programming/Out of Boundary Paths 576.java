

//   https://leetcode.com/problems/out-of-boundary-paths/


import java.util.*;
class Solution {
    int[][][] dp;
    int mod = 1000000007; 
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp = new int[m][n][maxMove + 1];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                Arrays.fill(dp[i][j], -1);
            }
        }

        return helper(m, n, maxMove, startRow, startColumn, 0);
    }

    public int helper(int m, int n, int max, int i, int j, int moves){
        if(i < 0 || j < 0 || i >= m || j >= n){
            return 1;
        }

        if(moves == max){
            return 0;
        }

        if(dp[i][j][moves] != -1){
            return dp[i][j][moves];
        }

        int cnt = 0;

        cnt = (cnt + helper(m, n, max, i + 1, j, moves + 1)) % mod;
        cnt = (cnt + helper(m, n, max, i - 1, j, moves + 1)) % mod;
        cnt = (cnt + helper(m, n, max, i, j + 1, moves + 1)) % mod;
        cnt = (cnt + helper(m, n, max, i, j - 1, moves + 1)) % mod;

        return dp[i][j][moves] = cnt % mod;
    }
}