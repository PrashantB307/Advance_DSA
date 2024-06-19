

//  https://leetcode.com/problems/smallest-range-i/


class Solution {
    public int smallestRangeI(int[] nums, int k) {
        
        int min = nums[0];
        int max = nums[0];

        for(int i = 1; i < nums.length; i++){
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }

        int diff = (max - k) - (min + k);

        return diff > 0 ? diff : 0;
    }
}