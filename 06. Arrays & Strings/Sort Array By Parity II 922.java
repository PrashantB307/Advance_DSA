

//   https://leetcode.com/problems/sort-array-by-parity-ii/


import java.util.*;
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for(int val : nums){
            if(val % 2 == 0){
                even.add(val);
            }else{
                odd.add(val);
            }
        }

        int j = 0, k = 0;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                nums[i] = even.get(j++);
            }else{
                nums[i] = odd.get(k++);
            }
        }

        return nums;
    }
}