

//   https://www.geeksforgeeks.org/problems/minimum-cost-to-make-two-strings-identical1107/1


class Solution {
    public int findMinCost(String x, String y, int costX, int costY) {
        int m = x.length();
        int n = y.length();

        int[][] dp = new int[m + 1][n + 1];

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(x.charAt(i - 1) == y.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        int len = dp[m][n];
        int minCost = (m - len) * costX + (n - len) * costY;

        return minCost;
    }
}
