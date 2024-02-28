

//   https://practice.geeksforgeeks.org/problems/number-of-paths0926/1


class Solution {
    long numberOfPaths(int M, int N) {
        int t = M + N - 2;
        int r = M - 1;
        long res = 1;
        final int mod = 1000000007;

        for (int i = 1; i <= r; i++) {
            res = (res * (t - r + i) % mod) * modInverse(i, mod) % mod;
        }

        return res;
    }

    long modInverse(int a, int mod){
        long m0 = mod;
        long x0 = 0;
        long x1 = 1;

        while(a > 1){
            long q = a / mod;
            long t = mod;

            mod = a % mod;
            a = (int)t;

            t = x0;
            x0 = x1 - q * x0;
            x1 = t;
        }

        if(x1 < 0){
            x1 += m0;
        }

        return x1;
    }
}