

//   https://leetcode.com/problems/subsets-ii/

//   https://www.geeksforgeeks.org/problems/subsets-1587115621/1

//   https://www.geeksforgeeks.org/problems/subset-sum-ii/1


import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        traverse(nums, ans, new ArrayList<>(), 0);

        return ans;
    }

    public void traverse(int[] nums, List<List<Integer>> ans, List<Integer> list, int st){

        ans.add(new ArrayList<>(list));

        for(int i = st; i < nums.length; i++){
            if(i > st && nums[i] == nums[i - 1]){
                continue;
            }
            list.add(nums[i]);

            traverse(nums, ans, list, i + 1);

            list.remove(list.size() - 1);
        }
    }
}