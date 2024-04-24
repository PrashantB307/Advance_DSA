

//    https://leetcode.com/problems/check-if-bitwise-or-has-trailing-zeros/


class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int bitwiseOR = nums[i] | nums[j];
                // Check if the bitwise OR has a trailing zero
                if ((bitwiseOR & 1) == 0) {
                    return true; // Found a pair with trailing zero
                }
            }
        }
        return false; // No pair with trailing zero found
    }
}