

//   https://leetcode.com/problems/3sum-closest/


import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int tar) {

        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for(int i = 0; i < n; i++){
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == tar){
                    return sum;
                }else if(sum < tar){
                    if(Math.abs(tar - sum) < min){
                        min = Math.abs(tar - sum);
                        ans = sum;
                    }
                    j++;
                }else{
                    if(Math.abs(tar - sum) < min){
                        min = Math.abs(tar - sum);
                        ans = sum;
                    }
                    k--;
                }
            }
        }

        return ans;
    }
}