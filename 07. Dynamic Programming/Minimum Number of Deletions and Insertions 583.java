

//   https://www.geeksforgeeks.org/problems/minimum-number-of-deletions-and-insertions0209/1

//   https://www.naukri.com/code360/problems/minimum-number-of-deletions-and-insertions_4244510

//   https://leetcode.com/problems/delete-operation-for-two-strings/


class Solution {
    public int minOperations(String str1, String str2) {
        int s1 = str1.length();
        int s2 = str2.length();

        int[][] dp = new int[s1 + 1][s2 + 1];

        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < s2; j++) {
                dp[i][j] = 0;
            }
        }

        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int lcs = dp[s1][s2]; // lcs = Longest Common Sequence

        return (s1 - lcs) + (s2 - lcs);
    }
}