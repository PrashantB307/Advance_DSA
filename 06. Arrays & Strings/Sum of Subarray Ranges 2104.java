

//    https://leetcode.com/problems/sum-of-subarray-ranges/


class Solution {
    public long subArrayRanges(int[] nums) {
        
        long ans = 0;
        for(int i = 0; i < nums.length; i++){
            int smin = Integer.MAX_VALUE;
            int smax = Integer.MIN_VALUE;

            for(int j = i; j < nums.length; j++){
                smin = Math.min(smin, nums[j]);
                smax = Math.max(smax, nums[j]);

                ans += (smax - smin);
            }
        }

        return ans;
    }
}