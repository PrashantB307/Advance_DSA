

//     https://leetcode.com/problems/find-the-difference-of-two-arrays/


import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int val : nums1){
            set1.add(val);
        }

        for(int val : nums2){
            set2.add(val);
        }

        List<Integer> res1 = new ArrayList<>();
        for(int val : set1){
            if(!set2.contains(val)){
                res1.add(val);
            }
        }

        ans.add(res1);

        List<Integer> res2 = new ArrayList<>();
        for(int val : set2){
            if(!set1.contains(val)){
                res2.add(val);
            }
        }

        ans.add(res2);

        return ans;
    }
}