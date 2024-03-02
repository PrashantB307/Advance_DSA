

//   https://www.geeksforgeeks.org/problems/sum-of-prime4751/1


class Solution {
    static int[] getPrimes(int N) {
        for (int i = 2; i < N; i++) {
            if (isPrime(i) && isPrime(N - i)) {
                return new int[] { i, N - i };
            }

        }

        return new int[] { -1, -1 };
    }

    static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    }
};