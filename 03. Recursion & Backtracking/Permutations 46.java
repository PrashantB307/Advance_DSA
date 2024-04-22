

//    https://leetcode.com/problems/permutations/


import java.util.*;
class Solution {
    public List<List<Integer>> permute(int[] nums) {

        int n = nums.length;

        List<Integer> arr = new ArrayList<>();
        for(int val : nums){
            arr.add(val);
        } 
        
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();

        helper(arr, n, set, 0);

        for(List<Integer> temp : set){
            ans.add(temp);
        }

        return ans;
    }

    public void helper(List<Integer> arr, int n, HashSet<List<Integer>> set, int idx){
        if(idx == n){
            List<Integer> list = new ArrayList<>(arr);
            set.add(list);
            return;
        }

        for(int i = 0; i < n; i++){
            int a = arr.get(i);
            int b = arr.get(idx);

            arr.set(i, b);
            arr.set(idx, a);

            helper(arr, n, set, idx + 1);

            arr.set(i, a);
            arr.set(idx, b);
        }
    }
}