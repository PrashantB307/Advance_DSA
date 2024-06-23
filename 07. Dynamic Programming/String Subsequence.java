

//   https://www.geeksforgeeks.org/problems/find-number-of-times-a-string-occurs-as-a-subsequence3020/1


class Solution {
    public static int countWays(String s1, String s2) {
        
        int n1 = s1.length();
        int n2 = s2.length();
        int mod = (int)1e9 + 7;

        int[][] dp = new int[n1 + 1][n2 + 1];
        for(int i = 0; i <= n1; i++){
            dp[i][0] = 1;
        }

        for(int i = 1; i <= n1; i++){
            for(int j = 1; j <= n2; j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - 1]) % mod;
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n1][n2] % mod;
    }
}
