

//   https://leetcode.com/problems/distribute-elements-into-two-arrays-i/description/


import java.util.*;
class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.add(nums[0]);
        list2.add(nums[1]);

        for(int i = 2; i < nums.length; i++){
            if(list.get(list.size() - 1) > list2.get(list2.size() - 1)){
                list.add(nums[i]);
            }else{
                list2.add(nums[i]);
            }
        }

        int[] res = new int[nums.length];
        int i = 0;
        for(int val : list){
            res[i++] = val;
        }

        for(int val : list2){
            res[i++] = val;
        }

        return res;
    }
}