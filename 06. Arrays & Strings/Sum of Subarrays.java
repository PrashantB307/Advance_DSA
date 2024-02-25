

//    https://practice.geeksforgeeks.org/problems/sum-of-subarrays2229/1


class Solution {
    public static long subarraySum( long arr[], long n) {
        long result = 0;
        long mod = 1000000007;

        for (int i=0; i<n; i++) {
            long currRes = ((i + 1) * (n - i)) * arr[i];
            result = (result % mod + currRes % mod) % mod;
        }

        return result;
    }
}