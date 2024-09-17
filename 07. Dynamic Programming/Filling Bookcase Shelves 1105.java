

//   https://leetcode.com/problems/filling-bookcase-shelves/


import java.util.*;
class Solution {
    int[][] dp;
    int W;
    public int minHeightShelves(int[][] books, int shelfWidth) {
        
        dp = new int[1001][1001];
        W = shelfWidth;

        for(int[] d : dp){
           Arrays.fill(d, -1);
        }

        int rem = shelfWidth;

        return solve(books, 0, rem, 0);
    }

    public int solve(int[][] books, int i, int rem, int maxH){
        if(i >= books.length){
            return maxH;
        }

        if(dp[i][rem] != -1){
            return dp[i][rem];
        }

        int bookW = books[i][0];
        int bookH = books[i][1];

        int keep = Integer.MAX_VALUE;
        int skip = Integer.MAX_VALUE;

        if(bookW <= rem){
            keep = solve(books, i + 1, rem - bookW, Math.max(maxH, bookH));
        }

        skip = maxH + solve(books, i + 1, W - bookW, bookH);

        return dp[i][rem] = Math.min(keep, skip);
    }
}