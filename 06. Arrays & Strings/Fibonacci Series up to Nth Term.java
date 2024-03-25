

//    https://www.geeksforgeeks.org/problems/fibonacci-series-up-to-nth-term/1


class Solution {
    int[] Series(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;
        ans[1] = 1;
        int mod = 1000000007;

        for (int i = 2; i <= n; i++) {
            ans[i] = (ans[i - 1] % mod + ans[i - 2] % mod) % mod;
        }

        return ans;
    }
}