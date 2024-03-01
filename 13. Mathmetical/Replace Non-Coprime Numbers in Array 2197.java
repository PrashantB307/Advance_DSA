

//    https://leetcode.com/problems/replace-non-coprime-numbers-in-array/


import java.util.*;
class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        
        LinkedList<Integer> res = new LinkedList<>();

        for(int val : nums){
            while (true) {
                
                int last = res.isEmpty() ? 1 : res.getLast();
                int gcd = getGCD(val, last);
                if(gcd == 1){
                    break;
                }

                val *= res.removeLast() / gcd;
            }

            res.add(val);
        }

        return res;
    }

    int getGCD(int a, int b){
        if(b == 0){
            return a;
        }

        return getGCD(b, a % b);
    }
}