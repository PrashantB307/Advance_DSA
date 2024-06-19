

//   https://leetcode.com/problems/special-array-ii/


import java.util.*;
class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;

        int[] preSum = new int[n];
        Arrays.fill(preSum, 0);

        for (int i = 1; i < n; i++) {
            preSum[i] = preSum[i - 1];
            if (nums[i - 1] % 2 == nums[i] % 2) {
                preSum[i]++;
            }
        }

        boolean[] result = new boolean[queries.length];
        Arrays.fill(result, true);

        if (n == 1) {
            return result;
        }

        for (int i = 0; i < queries.length; i++) {
            int from = queries[i][0];
            int to = queries[i][1];

            int cnt = preSum[to] - preSum[from];

            result[i] = (cnt >= 1) ? false : true;
        }

        return result;
    }
}