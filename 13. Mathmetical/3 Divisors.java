

//   https://www.geeksforgeeks.org/problems/3-divisors3942/1


import java.util.*;
class Solution {
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        while (q != 0) {
            long j = query.get(q - 1);

            int m = 0;
            for (int i = 1; i <= j; i++) {
                long c = i;
                long b = (long) Math.sqrt(i);

                if (b * b == c && isprime(b)) {
                    m++;
                }
            }

            arr.add(m);
            q--;
        }
        
        Collections.reverse(arr);
        return arr;
    }

    public static boolean isprime(long a) {
        if (a == 0 || a == 1) {
            return false;
        }

        for (long i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    }
}