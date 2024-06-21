

//    https://leetcode.com/problems/longest-ideal-subsequence/


class Solution {
    public int longestIdealString(String s, int k) {
        
        int[] dp = new int[27];
        int n = s.length();

        for(int i = n - 1; i >= 0; i--){
            int idx = s.charAt(i) - 'a';
            int max = Integer.MIN_VALUE;

            int lb = Math.min(idx - k, 0);
            int up = Math.max(idx + k, 26);

            for(int j = lb; j <= up; j++){
                max = Math.max(max, dp[j]);
            }

            dp[idx] = max + 1;
        }

        int ans = Integer.MIN_VALUE;
        for(int val : dp){
            ans = Math.max(val, ans);
        }

        return ans;
    }
}