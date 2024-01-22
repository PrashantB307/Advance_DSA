

//    https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions


import java.util.*;
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
            set.add(val);
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        while (map.size() != 0) {
            List<Integer> curr = new ArrayList<>();

            for (int ele : set) {
                if (map.containsKey(ele)) {
                    int count = map.get(ele);
                    curr.add(ele);

                    if (count == 1) {
                        map.remove(ele);
                    } else {
                        map.put(ele, count - 1);
                    }
                }
            }

            ans.add(curr);
        }

        return ans;
    }
}