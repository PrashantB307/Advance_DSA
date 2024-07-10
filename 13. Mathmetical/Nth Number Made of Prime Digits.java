

//    https://www.geeksforgeeks.org/problems/nth-number-made-of-prime-digits4319/1


import java.util.*;
class Solution {
    public static int primeDigits(int n) {
        if (n == 1) {
            return 2;
        } else if (n == 2) {
            return 3;
        } else if (n == 3) {
            return 5;
        } else if (n == 4) {
            return 7;
        }

        int[] primes = { 2, 3, 5, 7 };

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < primes.length; i++) {
            q.add(primes[i]);
        }

        int count = 5;
        while (!q.isEmpty()) {
            int x = q.remove();

            for (int i = 0; i < primes.length; i++) {
                int num = x * 10 + primes[i];
                if (count == n) {
                    return num;
                }

                ++count;
                q.add(num);
            }
        }

        return -1;
    }
}