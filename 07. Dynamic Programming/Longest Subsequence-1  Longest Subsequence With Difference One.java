

//   https://www.geeksforgeeks.org/problems/longest-subsequence-such-that-difference-between-adjacents-is-one4724/1

//   https://www.naukri.com/code360/problems/longest-subsequence-with-difference-one_1214549


class Solution {
    static int longestSubsequence(int N, int A[]) {
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) {
            dp[i] = 1;
        }

        int temp = -1;
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (Math.abs(A[j] - A[i]) == 1) {
                    temp = dp[j] + 1;
                    dp[i] = Math.max(dp[i], temp);
                }
            }
        }

        int ans = -1;
        for (int i = 0; i < N; i++) {
            ans = Math.max(dp[i], ans);
        }

        return ans;
    }
}