

//   https://leetcode.com/problems/non-decreasing-subsequences/


import java.util.*;
class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            helper(i, new ArrayList<>(), nums, set);
        }

        return new ArrayList<>(set);
    }

    public void helper(int idx, List<Integer> list, int[] nums, Set<List<Integer>> set) {
        if (idx == nums.length) {
            if (list.size() > 1) {
                List<Integer> listNew = new ArrayList<>(list);
                set.add(listNew);
            }

            return;
        }

        int curr = nums[idx++];
        if (!list.isEmpty() && curr >= list.get(list.size() - 1)){
            list.add(curr);
        }else{
            list.add(curr);
        }
            
        for (int i = idx; i < nums.length; i++) {
            if (nums[i] >= list.get(list.size() - 1)){
                helper(i, list, nums, set);
            }  
        }

        if (list.size() > 1) {
            List<Integer> listNew = new ArrayList<>(list);
            set.add(listNew);
        }

        if (!list.isEmpty()){
            list.remove(list.size() - 1);
        }
    }
}