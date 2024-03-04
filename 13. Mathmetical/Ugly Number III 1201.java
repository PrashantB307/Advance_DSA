

//   https://leetcode.com/problems/ugly-number-iii/


class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {
        int left = 1;
        int right = Integer.MAX_VALUE;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isUgly(mid, a, b, c, n)) {
                right = mid;
            } else
                left = mid + 1;
        }
        return left;
    }

    public boolean isUgly(long mid, long a, long b, long c, long n) {
        return (int) (mid / a + mid / b + mid / c - mid / lcm(a, b) - mid / lcm(b, c)
                - mid / lcm(c, a) + mid / lcm(a, lcm(b, c))) >= n;
    }

    public long gcd(long a, long b) {
        if (a == 0)
            return b;
        else
            return gcd(b % a, a);
    }

    public long lcm(long a, long b) {
        return a * b / (gcd(a, b));
    }
}