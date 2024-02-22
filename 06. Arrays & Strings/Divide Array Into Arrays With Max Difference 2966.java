

//    https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/


import java.util.*;
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        
        int n = nums.length;
        if(n % 3 != 0){
            return new int[][]{};
        }

        Arrays.sort(nums);
        for(int i = 0; i < n - 2; i = i + 3){
            if(nums[i + 2] - nums[i] > k){
                return new int[][]{};
            }
        }

        int[][] ans = new int[n / 3][3];
        int idx = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                ans[i][j] = nums[idx++];
            }
        }

        return ans;
    }
}