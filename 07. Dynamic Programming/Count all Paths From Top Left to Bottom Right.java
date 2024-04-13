

//    https://www.geeksforgeeks.org/problems/count-all-possible-paths-from-top-left-to-bottom-right3011/1


class Solution {
    long numberOfPaths(int m, int n) {
        long[][] totalPaths = new long[m][n];
        long mod = 1000000007;

        for (int i = 0; i < m; i++) {
            totalPaths[i][n - 1] = 1;
        }
        
        for (int i = 0; i < n; i++) {
            totalPaths[m - 1][i] = 1;
        }
        
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                totalPaths[i][j] = (totalPaths[i + 1][j] + totalPaths[i][j + 1]) % mod;
            }
        }
        
        return totalPaths[0][0];
    }
}