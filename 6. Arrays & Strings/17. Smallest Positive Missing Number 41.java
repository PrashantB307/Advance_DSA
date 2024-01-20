


//     https://leetcode.com/problems/first-missing-positive/

//     https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1


class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(nums[i] <= 0 || nums[i] > n){
                nums[i] = n + 1;
            }
        }

        for(int i = 0; i < n; i++){
            int val = Math.abs(nums[i]);

            if(val <= n){
                int idx = val - 1;

                if(nums[idx] > 0){
                    nums[idx] = -1 * nums[idx];
                }
            }
        }

        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                return i + 1;
            }
        }

        return n + 1;
    }
}