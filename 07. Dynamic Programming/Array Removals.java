

//   https://www.geeksforgeeks.org/problems/array-removals/1

//   https://www.codingninjas.com/studio/problems/minimum-removals_1214550


import java.util.*;
class Solution {

    int[][] dp = new int[100][100];
    int removals(int[] arr, int n, int k) {

        Arrays.sort(arr);

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        return solve(arr, 0, n - 1, k);
    }

    int solve(int[] arr, int i ,int j, int k){

        if(i >= j){
            return 0;
        }

        if(arr[j] - arr[i] <= k){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        dp[i][j] = 1 + Math.min(solve(arr, i + 1, j, k), solve(arr, i, j - 1, k));

        return dp[i][j];
    }
}