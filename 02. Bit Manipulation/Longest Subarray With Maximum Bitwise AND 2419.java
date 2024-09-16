

//   https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and/


class Solution {
    public int longestSubarray(int[] nums) {
        
        int maxNum = 0;
       
        for(int val : nums){
            maxNum = Math.max(maxNum, val);
        }

        int cnt = 0;
        int max = 1;
        int i = 0;

        while(i < nums.length){
            if(nums[i] == maxNum){
                while(i < nums.length && nums[i++] == maxNum){
                    cnt++;
                }

                max = Math.max(max, cnt);
                cnt = 0;
            }else{
                i++;
            }
        }

        return max;
    }
}