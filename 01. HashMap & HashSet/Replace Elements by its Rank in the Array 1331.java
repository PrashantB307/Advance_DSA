

//    https://leetcode.com/problems/rank-transform-of-an-array/description/

//    https://practice.geeksforgeeks.org/problems/replace-elements-by-its-rank-in-the-array/1


import java.util.*;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy = arr.clone();
        Arrays.sort(copy);
        int i = 1;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : copy){
            if(!map.containsKey(val)){
                map.put(val, i++);
            }
        }

        int j = 0;
        int[] ans = new int[arr.length];
        for(int val : arr){
            ans[j++] = map.get(val);
        }

        return ans;
    }
}