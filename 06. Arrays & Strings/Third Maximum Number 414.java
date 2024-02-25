

//    https://leetcode.com/problems/third-maximum-number/description/


import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);

        if(n < 3){
            return nums[n - 1];
        }

        int cnt = 1;

        for(int i = n - 1;i > 0; i--){
            if(nums[i] != nums[ i - 1]){
                cnt++;
            }

            if(cnt == 3){
                return nums[i - 1];
            }else if(cnt > 3){
                break;
            }
        }

        return nums[n - 1];
    }
}