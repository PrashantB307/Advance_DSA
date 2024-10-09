

//   https://www.geeksforgeeks.org/problems/return-two-prime-numbers2509/1


import java.util.*;
class Solution {
    static List<Integer> primeDivision(int n) {
        
        List<Integer> list = new ArrayList<>();

        for(int i = 2; i < n ; i++){
            if(isPrime(i) && isPrime(n - i)){
                list.add(i);
                list.add(n - i);
                break;
            }
        }

        return list;
    }

    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        
        if(n == 2){
            return true;
        }

        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}