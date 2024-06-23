

//   https://www.geeksforgeeks.org/problems/partitions-with-given-difference/1

//   https://www.naukri.com/code360/problems/partitions-with-given-difference_3751628


class Solution {

    static int mod = 1000000007;
    public static int countPartitions(int n, int d, int[] arr) {
        
        int sum = 0;
        for(int val : arr){
            sum += val;
        }

        if(sum < d || (sum - d) % 2 != 0){
            return 0;
        }

        int k = (sum - d) / 2;

        int[][] dp = new int[n + 1][sum + 1];

        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= sum; j++){
                dp[i][j] = -1;
            }
        }

        return helper(0, k, arr, dp);
    }

    public static int helper(int i, int sum, int[] arr, int[][] dp){
        if(sum < 0){
            return 0;
        }

        if(i == arr.length){
            return sum == 0 ? 1 : 0;
        }

        if(dp[i][sum] != -1){
            return dp[i][sum];
        }

        dp[i][sum] = (helper(i + 1, sum, arr, dp) % mod + helper(i + 1, sum - arr[i], arr, dp) % mod) % mod;

        return dp[i][sum];
    }
}
        
