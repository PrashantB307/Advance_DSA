

//   https://leetcode.com/problems/count-submatrices-with-top-left-element-and-sum-less-than-k/


class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        int[][] prefixSum = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefixSum[i][j] = grid[i - 1][j - 1] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
            }
        }

        for (int p = 1; p <= m; p++) {
            for (int q = 1; q <= n; q++) {
                int sum = prefixSum[p][q];
                if (sum <= k) {
                    count++;
                }
            }
        }

        return count;
    }
}