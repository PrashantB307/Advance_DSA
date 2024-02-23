

//   https://leetcode.com/problems/max-number-of-k-sum-pairs/


import java.util.*;
class Solution {
    public int maxOperations(int[] nums, int k) {
        
        Arrays.sort(nums);
        int cnt = 0;

        int l = 0;
        int r = nums.length - 1;

        while(l < r){
            if(nums[l] + nums[r] == k){
                cnt++;
                l++;
                r--;
            }else if(nums[l] + nums[r] < k){
                l++;
            }else{
                r--;
            }
        }

        return cnt;
    }
}