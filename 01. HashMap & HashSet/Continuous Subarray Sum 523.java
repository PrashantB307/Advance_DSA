

//    https://leetcode.com/problems/continuous-subarray-sum/


import java.util.*;
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        if(nums.length < 2){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);

        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            int rem = sum % k;
            if(map.containsKey(rem)){
                if(map.get(rem) < i){
                    return true;
                }
            }else{
                map.put(rem, i + 1);
            }
        }

        return false;
    }
}