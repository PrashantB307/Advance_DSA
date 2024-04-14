

//   https://www.geeksforgeeks.org/problems/form-a-palindrome2544/1

//   https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/description/

//   https://www.codingninjas.com/studio/problems/minimum-insertions-to-make-a-string-palindrome_985293


class Solution {
    int findMinInsertions(String S) {
        int n = S.length();
        int[][] dp = new int[n][n];

        for (int gap = 0; gap < dp.length; gap++) {
            for(int i = 0, j = gap; j < dp.length; i++, j++){
                if(gap == 0){
                    dp[i][j] = 1;
                }else{
                    if(S.charAt(i) == S.charAt(j)){
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    }else{
                        dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                    }
                }
            }
        }

        return n - dp[0][dp.length - 1];
    }
}