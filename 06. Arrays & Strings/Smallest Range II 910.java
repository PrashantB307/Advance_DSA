

//    https://leetcode.com/problems/smallest-range-ii/

//    https://www.naukri.com/code360/problems/smallest-range-ii_1459127


import java.util.*;
class Solution {
    public int smallestRangeII(int[] nums, int k) {
        
        int n = nums.length;
        Arrays.sort(nums);

        int res = nums[n - 1] - nums[0];

        for(int i = 0; i < n - 1; i++){
            int j = i + 1;
            int min = Math.min(nums[0] + k, nums[j] - k);
            int max = Math.max(nums[n - 1] - k , nums[i] + k);

            res = Math.min(res, max - min);
        }

        return res;
    }
}