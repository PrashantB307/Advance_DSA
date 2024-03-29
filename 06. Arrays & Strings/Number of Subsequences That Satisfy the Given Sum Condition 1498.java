

//   https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/description/


import java.util.*;
class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int[] pow = new int[nums.length];
        pow[0] = 1;

        int mod = 1000000007;

        for(int i = 1; i < nums.length; i++){
            pow[i] = (pow[i - 1] * 2) % mod;
        }

        int l = 0;
        int r = nums.length - 1;
        int res = 0;

        while (l <= r) {
            if(nums[l] + nums[r] <= target){
                int diff = r - l;
                res = (res % mod + pow[diff]) % mod;
                l++;
            }else{
                r--;
            }
        }

        return res;
    }
}