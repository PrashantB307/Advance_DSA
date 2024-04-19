

//   https://www.geeksforgeeks.org/problems/maximize-dot-product2649/1

//   https://www.naukri.com/code360/problems/maximise-dot-product_1473847


class Solution {
    public int maxDotProduct(int n, int m, int[] A, int[] B) {

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {

            for (int j = i; j <= n; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1] + (A[j - 1] * B[i - 1]), dp[i][j - 1]);
            }
        }

        return dp[m][n];
    }
}