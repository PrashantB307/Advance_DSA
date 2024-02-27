

//   https://leetcode.com/problems/find-greatest-common-divisor-of-array/


import java.util.*;
class Solution {
    public int findGCD(int[] nums) {
        
        Arrays.sort(nums);
        int n1 = nums[0];
        int n2 = nums[nums.length - 1];
        int n = 0;

        for(int i = 1; i <= n1; i++){
            if(n1 % i == 0 && n2 % i == 0){
                n = i;
            }
        }

        return n;
    }
}