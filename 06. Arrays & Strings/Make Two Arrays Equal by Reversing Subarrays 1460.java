

//   https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/


import java.util.*;
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length != arr.length){
            return false;
        }
        Arrays.sort(target);
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            if(target[i] != arr[i]){
                return false;
            }
        }

        return true;
    }
}