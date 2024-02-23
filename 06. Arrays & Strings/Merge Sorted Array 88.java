

//    https://leetcode.com/problems/merge-sorted-array/description/


import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i = 0; i < n; i++){
            nums1[m + 1] = nums2[i];
            m++;
        }

        Arrays.sort(nums1);
    }
}