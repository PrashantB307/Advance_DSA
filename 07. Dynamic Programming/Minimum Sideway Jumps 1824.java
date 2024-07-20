

//   https://leetcode.com/problems/minimum-sideway-jumps/


import java.util.*;
class Solution {
    public int minSideJumps(int[] obstacles) {
        
        int n = obstacles.length;
        int[][] dp=  new int[4][n];
        
        for(int[] arr : dp){
            Arrays.fill(arr, - 1);
        }

        return solve(obstacles, 0, 2, dp);
    }

    public int solve(int[] obstacles, int poss, int len, int[][] dp){
        if(poss == obstacles.length - 1){
            return 0;
        }

        if(dp[len][poss] != -1){
            return dp[len][poss];
        }

        if(obstacles[poss + 1] != len){
            return solve(obstacles, poss + 1, len, dp);
        }else{
            int ans = Integer.MAX_VALUE;
            for(int i = 1; i < 4; i++){
                if(len != i && obstacles[poss] != i){
                    ans = Math.min(ans, 1 + solve(obstacles, poss, i, dp));
                }
            }
            dp[len][poss] = ans;

            return dp[len][poss];
        }
    }
}