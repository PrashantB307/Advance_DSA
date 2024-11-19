

//   https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/


import java.util.*;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        long sum = 0;
        long max = 0;
        int i = 0;

        for (int j = 0; j < n; j++) {
            if (!set.contains(nums[j])) {
                sum += nums[j];
                set.add(nums[j]);

                if (j - i + 1 == k) {
                    max = Math.max(max, sum);
                    sum -= nums[i];
                    set.remove(nums[i]);
                    i++;
                }
            } else {
                while (nums[i] != nums[j]) {
                    sum -= nums[i];
                    set.remove(nums[i]);
                    i++;
                }

                i++;
            }
        }

        return max;
    }
}