

//   https://leetcode.com/problems/sum-of-all-subset-xor-totals/


class Solution {
    public int subsetXORSum(int[] nums) {
        
        return helper(nums, 0, 0);
    }

    public int helper(int[] nums, int i, int xor){
        if(i == nums.length){
            return xor;
        }

        int inc = helper(nums, i + 1, xor ^ nums[i]);
        int exc = helper(nums, i + 1, xor);

        return inc + exc;
    }
}