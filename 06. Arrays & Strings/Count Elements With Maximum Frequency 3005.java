

//    https://leetcode.com/problems/count-elements-with-maximum-frequency/description/


class Solution {
    public int maxFrequencyElements(int[] nums) {

        int[] arr = new int[101];

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }

        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            max = Math.max(val, max);
        }

        int cnt = max;
        int ans = 0;

        for (int val : arr) {
            if (val == max) {
                ans += cnt;
            }
        }
        return ans;

    }
}