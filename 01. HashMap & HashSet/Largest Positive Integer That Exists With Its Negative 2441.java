

//    https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/


import java.util.*;
class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int val : nums){
            set.add(val);
        }

        int max = -1;
        for(int val : nums){
            if(val > max && set.contains(-val)){
                max = val;
            }
        }

        return max;
    }
}