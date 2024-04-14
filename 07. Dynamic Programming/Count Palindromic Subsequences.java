

//   https://www.geeksforgeeks.org/problems/count-palindromic-subsequences/1

//   https://www.codingninjas.com/studio/problems/count-palindromic-subsequences_1062696


class Solution
{
    long countPS(String str)
    {
        long mod = 1000000007;
        int n = str.length();

        long[][] dp = new long[n][n];

        for(int gap = 0; gap < n; gap++){
            int i = 0;
            for(int j = gap; j < n; j++, i++){
                if(gap == 0){
                    dp[i][j] = 1;
                }else if(gap == 1){
                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] = 3;
                    }else{
                        dp[i][j] = 2;
                    }
                }else{
                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] = ((dp[i][j - 1] % mod + dp[i + 1][j] % mod) % mod + 1) % mod;
                    }else{
                        dp[i][j] = ((dp[i][j - 1] % mod + dp[i + 1][j] % mod  - dp[i + 1][j - 1]) % mod + mod) % mod;
                    }
                }
            }
        }

        return dp[0][n - 1];
    }
}