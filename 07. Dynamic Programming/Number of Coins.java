

//   https://www.geeksforgeeks.org/problems/number-of-coins1824/1


class Solution{

	public int minCoins(int coins[], int M, int V) 
	{ 
	    int[] dp = new int[V + 1];
        dp[0] = 0;

        for(int i = 1; i <= V; i++){
            dp[i] = Integer.MAX_VALUE;
        }

        for(int i = 1; i <= V; i++){
            for(int j = 0; j < M; j++){
                if(coins[j] <= i){
                    int val = dp[i - coins[j]];
                    if(val != Integer.MAX_VALUE && val + 1 < dp[i]){
                        dp[i] = val + 1;
                    }
                }
            }
        }

        if(dp[V] == Integer.MAX_VALUE){
            return -1;
        }

        return dp[V];
	} 
}