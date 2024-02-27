

//    https://www.geeksforgeeks.org/problems/find-prime-numbers-in-a-range4718/1

import java.util.*;
class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = M; i <= N; i++){
            if(isPrime(i)){
                list.add(i);
            }
        }

        return list;
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