

//   https://leetcode.com/problems/range-sum-of-sorted-subarray-sums/description/


import java.util.*;
class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        
        int[] arr = new int[n * (n + 1) / 2];
        int k = 0;

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += nums[j];
                arr[k++] = sum;
            }
        }

        Arrays.sort(arr);
        int mod = 1000000007;
        int sum = 0;
    
        for(int j = left - 1; j < right; j++){
            sum = (sum + arr[j]) % mod;
        }
        
        return sum;
    }
}