

//    https://www.geeksforgeeks.org/problems/unique-paths-in-a-grid--170647/1

//    https://leetcode.com/problems/unique-paths-ii/


class Solution {
    static int uniquePaths(int n, int m, int[][] grid) {
        
        int[][] dp = new int[n][m];
        int mod = 1000000007;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 0){
                    dp[i][j] = 0;
                }else if(i == 0 && j == 0){
                    dp[i][j] = 1;
                }else{
                    int a = 0;
                    int b = 0;

                    if(i > 0){
                        a = dp[i - 1][j] % mod;
                    }

                    if(j > 0){
                        b = dp[i][j - 1] % mod;
                    }

                    dp[i][j] = (a + b) % mod;
                }
            }
        }

        return dp[n - 1][m - 1];
    }
};