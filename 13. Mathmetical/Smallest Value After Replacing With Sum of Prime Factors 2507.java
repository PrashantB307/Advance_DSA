

//    https://leetcode.com/problems/smallest-value-after-replacing-with-sum-of-prime-factors/


class Solution {
    public int smallestValue(int n) {

        if (n <= 4) {
            return n;
        }
        if (isPrime(n)) {
            return n;
        }

        int min = Integer.MAX_VALUE;
        while (n != 0) {

            int sum = factor(n);
            min = Math.min(min, sum);
            if (isPrime(sum)) {
                break;
            }

            n = sum;
        }

        return min;
    }

    int factor(int num) {
        int factor = 2;
        int sum = 0;

        while (num != 1) {
            if (num % factor == 0) {
                num /= factor;
                sum += factor;
                continue;
            }

            factor++;
        }
        return sum;
    }

    boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}