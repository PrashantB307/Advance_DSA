

//   https://leetcode.com/problems/find-common-elements-between-two-arrays/


import java.util.*;
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        
        int cnt1 = 0;
        int cnt2 = 0;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int val : nums1){
            set1.add(val);
        }

        for(int val : nums2){
            set2.add(val);
        }

        for(int val : nums1){
            if(set2.contains(val)){
                cnt1++;
            }
        }

        for(int val : nums2){
            if(set1.contains(val)){
                cnt2++;
            }
        }

        return new int[]{cnt1, cnt2};
    }
}