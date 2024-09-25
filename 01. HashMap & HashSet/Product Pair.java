

//   https://www.geeksforgeeks.org/problems/equal-to-product3836/1


import java.util.*;
class Solution {
    boolean isProduct(int[] arr, long x) {
        HashSet<Long> set = new HashSet<>();
    
        for(int val : arr){
            if(val != 0 && x % val == 0){
                long rem = x / val;

                if(set.contains(rem)){
                    return true;
                }

                set.add((long)val);
            }else if(val == 0 && x == 0){
                return true;
            }
        }

        return false;
    }
}