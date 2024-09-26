

//   https://leetcode.com/problems/sort-the-people


import java.util.*;
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        TreeMap<Integer, String> map = new TreeMap<>();
        for(int i = 0; i < names.length; i++){
            map.put(heights[i], names[i]);
        }

        String[] ans = new String[names.length];
        int i = 1;
        int n = names.length;

        for(int val : map.keySet()){
            ans[n - i] = map.get(val);
            i++;
        }

        return ans;
    }
}