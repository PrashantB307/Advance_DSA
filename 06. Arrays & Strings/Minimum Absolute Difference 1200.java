

//   https://leetcode.com/problems/minimum-absolute-difference/description/


import java.util.*;
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for(int i = 1; i < arr.length; i++){
            min = Math.min(min, arr[i] - arr[i - 1]);
        }

        for(int i = 1; i < arr.length; i++){
            List<Integer> list = new ArrayList<>();
            if(arr[i] - arr[i - 1] == min){
                list.add(arr[i - 1]);
                list.add(arr[i]);
            }

            if(list.size() > 0){
                ans.add(list);
            }
        }

        return ans;
    }
}