

//   https://leetcode.com/problems/minimum-falling-path-sum/


class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];

        for(int j = 0; j < n; j++){
            dp[0][j] = matrix[0][j];
        }

        for(int i = 1; i < m; i++){
            for(int j = 0; j < n; j++){
                int left = Integer.MAX_VALUE;
                int right = Integer.MAX_VALUE;
                int low = matrix[i][j] + dp[i - 1][j];

                if(j - 1 >= 0){
                    left = matrix[i][j] + dp[i - 1][j - 1];
                }

                if(j + 1 < m){
                    right = matrix[i][j] + dp[i - 1][j + 1];
                }

                dp[i][j] = Math.min(low, Math.min(left, right));
            }
        }

        int min = dp[n - 1][0];
        for(int i = 1; i < n; i++){
            min = Math.min(min, dp[n - 1][i]);
        }

        return min;
    }
}