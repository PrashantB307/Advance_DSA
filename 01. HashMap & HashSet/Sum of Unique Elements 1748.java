

//   https://leetcode.com/problems/sum-of-unique-elements/

//   https://www.geeksforgeeks.org/problems/sum-of-distinct-elements4801/1


import java.util.*;
class Solution {
    public int sumOfUnique(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : nums){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        int sum = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() < 2) {
                sum += entry.getKey();
            }
        }

        return sum;
    }
}