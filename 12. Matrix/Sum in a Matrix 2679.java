

//   https://leetcode.com/problems/sum-in-a-matrix/


import java.util.*;
class Solution {
    public int matrixSum(int[][] nums) {
        
        int res = 0;
        int n = nums.length;
        int m = nums[0].length;

        for(int[] arr : nums){
            Arrays.sort(arr);
        }

        for(int i = 0; i < m; i++){
            int max = 0;
            for(int j = 0; j < n; j++){
                max = Math.max(max, nums[j][i]);
            }

            res += max;
        }

        return res;
    }
}