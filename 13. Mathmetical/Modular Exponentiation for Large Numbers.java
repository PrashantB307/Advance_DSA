

//   https://www.geeksforgeeks.org/problems/modular-exponentiation-for-large-numbers5537/1


class Solution {
    public long PowMod(long x, long n, long m) {
        long result = 1;
        x = x % m;

        while (n > 0) {
            if (n % 2 == 1) {
                result = (result * x) % m;
            }
            x = (x * x) % m;
            n = n / 2;
        }

        return result;
    }
}