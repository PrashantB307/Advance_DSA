

//    https://leetcode.com/problems/count-array-pairs-divisible-by-k/


import java.util.*;
class Solution {
    public long countPairs(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        long res = 0;

        for(int i = 0; i < nums.length; i++){
            int gcd = findGCD(nums[i], k);

            for(int num : map.keySet()){
                if((long)(gcd * num) % k == 0){
                    res += map.get(num);
                }
            }

            map.put(gcd, map.getOrDefault(gcd, 0) + 1);
        }

        return res;
    }

    int findGCD(int a, int b){
        if(b == 0){
            return a;
        }else{
            return findGCD(b, a % b);
        }
    }
}