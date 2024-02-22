

//    https://leetcode.com/problems/shortest-unsorted-continuous-subarray/

//    https://www.geeksforgeeks.org/problems/length-unsorted-subarray3022/1


import java.util.*;
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length == 1){
            return 0;
        }

        int[] arr = nums.clone();
        Arrays.sort(arr);

        int start = -1;
        int end = 0;

        for(int i = 0; i < nums.length; i++) {
            if(arr[i] != nums[i]){
                start = i;
                break;
            }
        }

        if(start == -1){
            return 0;
        }

        for(int i = nums.length - 1; i >= 0; i--) {
            if(arr[i] != nums[i]){
                end = i;
                break;
            }
        }

        return end - start + 1;
    }
}