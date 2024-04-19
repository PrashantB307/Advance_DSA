

//  https://www.geeksforgeeks.org/problems/ncr1019/1

//  https://www.naukri.com/code360/problems/binomial-coefficient-problem_1229410


class solve{
    
    static int nCr(int n, int r){
        int mod = 1000000007;
        int[] dp = new int[r + 1];
        dp[0] = 1;

        if(r > n){
            return 0;
        }

        if(r == 0 || r == n){
            return 1;
        }

        if(r > n - r){
            r = n - r;
        }

        for(int i = 0; i <= n; i++){
            for(int j = Math.min(i, r); j > 0 ; j--){
                dp[j] = (dp[j] + dp[ j -1]) % mod;
            }
        }

        return dp[r];
    }
}