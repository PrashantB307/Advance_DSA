

//    https://practice.geeksforgeeks.org/problems/large-factorial4721/1


class Solution {
    public long[] factorial(long a[], int n) {
        int mod = 1000000007;
        int max = 0;

        for (long i : a) {
            max = Math.max(max, (int) i);
        }

        long dp[] = new long[max + 1];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= max; i++){
            dp[i] = (i * dp[i - 1]) % mod;
        }
            

        long ans[] = new long[n];
        for (int i = 0; i < n; i++) {
            ans[i] = dp[(int) a[i]];
        }

        return ans;
    }
}