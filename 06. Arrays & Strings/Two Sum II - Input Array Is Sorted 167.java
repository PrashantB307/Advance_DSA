

//    https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/


class Solution {
    public int[] twoSum(int[] nums, int tar) {
        int[] ans = new int[2];
        int l = 0;
        int r = nums.length - 1;

        while(l < r){
            int sum = nums[l] + nums[r];

            if(sum > tar){
                r--;
            }else if(sum < tar){
                l++;
            }else{
                ans[0] = l + 1;
                ans[1] = r + 1;
                break;
            }
        }
        return ans;
    }
}