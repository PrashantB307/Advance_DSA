

//   https://leetcode.com/problems/combination-sum-ii/

//   https://www.geeksforgeeks.org/problems/combination-sum-ii-1664263832/1


import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);

        solve(candidates, curr, ans, 0, target);

        return ans;
    }

    public void solve(int[] arr, List<Integer> curr, List<List<Integer>> ans, int idx, int tar){
        if(tar < 0){
            return;
        }

        if(tar == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i = idx; i < arr.length; i++){
            if(i > idx && arr[i] == arr[i - 1]){
                continue;
            }

            curr.add(arr[i]);
            solve(arr, curr, ans, i + 1, tar - arr[i]);
            curr.remove(curr.size() - 1);
        }
    }
}