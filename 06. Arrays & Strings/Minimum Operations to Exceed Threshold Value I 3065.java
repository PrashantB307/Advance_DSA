

//   https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/description/


import java.util.*;
class Solution {
    public int minOperations(int[] nums, int k) {
        
        Arrays.sort(nums);
        int cnt = 0;

        for(int val : nums){
            if(val < k){
                cnt++;
            }else{
                break;
            }
        }

        return cnt;
    }
}