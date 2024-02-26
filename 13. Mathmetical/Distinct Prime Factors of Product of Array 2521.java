

//    https://leetcode.com/problems/distinct-prime-factors-of-product-of-array/


import java.util.*;
class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int val : nums) {
            int i = 2;

            while (val > 1) {
                if(val % i == 0){
                    set.add(i);
                    val = val / i;
                }else{
                    i++;
                }
            }
        }

        return set.size();
    }
}
