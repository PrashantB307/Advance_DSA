class Solution {
    public int maxProductPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int mod = 1000000007;
        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dp[i][0] = grid[i][j];
                dp[0][j] = grid[i][j];
            }
        }
        
    }
}