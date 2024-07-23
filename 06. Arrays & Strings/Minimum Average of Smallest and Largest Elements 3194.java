

//   https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/


import java.util.*;
class Solution {
    public double minimumAverage(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0, j = n - 1;
        double min = nums[j];
       

        while (i <= n / 2) {
            double avg = (nums[i] + nums[j]) / 2.0;
            min = Math.min(min, avg);
            i++;
            j--;
        }

        return min;

    }
}