

//    https://www.geeksforgeeks.org/problems/grinding-geek/1


class Solution {
    public int max_courses(int n, int total, int[] cost) {
        
        int[][] dp = new int[n + 1][total + 1];

        for(int i = n - 1; i >= 0; i--){
            for(int j = 0; j < total + 1; j++){
                int take = 0;
                int notake = 0;

                notake = dp[i + 1][j];

                if(cost[i] <= j){
                    int rem = j - cost[i] + (cost[i] * 9) / 10;
                    take = 1 + dp[i + 1][rem];
                }

                dp[i][j] = Math.max(take, notake);
            }
        }

        return dp[0][total];
    }
}
