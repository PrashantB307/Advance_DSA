

//   https://www.geeksforgeeks.org/problems/minimum-number-of-deletions4610/1


class Solution 
{ 
    int minDeletions(String s, int n)
    {
        int[][] dp = new int[n][n];

        for(int g = 0; g < dp[0].length; g++){
            for(int i = 0, j = g; j < dp[0].length; j++, i++){
                if(g == 0){
                    dp[i][j] = 1;
                }else if(g == 1){
                    dp[i][j] = (s.charAt(i) == s.charAt(j)) ? 2 : 1;
                }else{
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    }else{
                        dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                    }
                }
            }
        }

        return n - dp[0][dp[0].length - 1];
    }
} 