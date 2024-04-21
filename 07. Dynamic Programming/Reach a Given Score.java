

//   https://www.geeksforgeeks.org/problems/reach-a-given-score-1587115621/1


class Geeks {
    public long count(int n) {
        int[] dp = new int[n + 1];
        int[] scores = {3, 5, 10};

        dp[0] = 1;

        for(int sc : scores){
            for(int i = 1; i <= n; i++){
                if(i - sc >= 0){
                    dp[i] += dp[i - sc]; 
                }
            }
        }

        return dp[n];
    }
}