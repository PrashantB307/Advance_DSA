

//   https://leetcode.com/problems/split-the-array/description/


import java.util.*;
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        boolean flag = true;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > 2) {
                flag = false;
                break;
            }
        }
        
        return flag;
    }
}