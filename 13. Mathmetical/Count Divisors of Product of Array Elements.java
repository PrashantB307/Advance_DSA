

//    https://www.geeksforgeeks.org/problems/count-divisors-of-product-of-array-elements0244/1


import java.util.*;
class Solution {
    public long countDivisorsMult(long[] arr, long n) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long temp = arr[i];

            for (int j = 2; j <= Math.sqrt(temp); j++) {
                while (temp % j == 0) {

                    mp.put(j, mp.getOrDefault(j, 0) + 1);

                    temp /= j;
                }
            }

            if (temp != 1) {
                mp.put((int) temp, mp.getOrDefault((int) temp, 0) + 1);
            }
        }

        long res = 1;

        for (Map.Entry<Integer, Integer> x : mp.entrySet()) {
            res *= x.getValue() + 1;
        }

        return res;
    }
}