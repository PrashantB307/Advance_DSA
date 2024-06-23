

//   https://leetcode.com/problems/student-attendance-record-ii/


import java.util.*;
class Solution {

    int m = 1000000007;
    int[][][] dp = new int[100001][2][3];

    public int checkRecord(int n) {

        for (int i = 0; i < 100001; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return solve(n, 0, 0);
    }

    public int solve(int n, int abs, int late) {
        if (abs >= 2 || late >= 3) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }

        if (dp[n][abs][late] != -1) {
            return dp[n][abs][late];
        }

        int A = solve(n - 1, abs + 1, 0) % m;
        int L = solve(n - 1, abs, late + 1) % m;
        int P = solve(n - 1, abs, 0) % m;

        return dp[n][abs][late] = ((A + L) % m + P) % m;

    }
}