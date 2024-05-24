

//   https://www.geeksforgeeks.org/problems/sum-of-all-substrings-of-a-number-1587115621/1


class Solution {
    public static long sumSubstrings(String s) {
        int mod = 1000000007;
        int n = s.length();
        long res = 0;
        long multi = 1;

        for (int i = n - 1; i >= 0; i--) {
            int d = s.charAt(i) - '0';
            res = (res + (d * multi * (i + 1)) % mod) % mod;
            multi = (multi * 10 + 1) % mod;
        }
        
        return res;
    }
}