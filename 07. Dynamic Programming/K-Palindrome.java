

//   https://www.geeksforgeeks.org/problems/find-if-string-is-k-palindrome-or-not1923/1

//   https://www.naukri.com/code360/problems/k-palindrome_2434296


import java.util.*;
class Solution {
    int lcs(int n, int m, String s1, String s2, int dp[][]) {
        if (n == 0 || m == 0){
            return 0;
        }
            
        if (dp[n][m] != -1){
            return dp[n][m];
        }
            
        if (s1.charAt(n - 1) == s2.charAt(m - 1)){
            return dp[n][m] = 1 + lcs(n - 1, m - 1, s1, s2, dp);
        }else{
            return dp[n][m] = Math.max(lcs(n - 1, m, s1, s2, dp), lcs(n, m - 1, s1, s2, dp));
        }   
    }

    String reverse(String str) {
        StringBuilder s1 = new StringBuilder(str);
        s1.reverse();
        return s1.toString();
    }

    public int kPalindrome(String str, int n, int k) {
        String temp = reverse(str);
        int dp[][] = new int[n + 1][n + 1];
        
        for (int a[] : dp){
            Arrays.fill(a, -1);
        }
            
        int ans = lcs(n, n, temp, str, dp);
        int diff = n - ans;
        
        return diff <= k ? 1 : 0;
    }
}