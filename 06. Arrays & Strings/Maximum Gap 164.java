

//    https://leetcode.com/problems/maximum-gap/description/

//    https://practice.geeksforgeeks.org/problems/maximum-gap3845/1



import java.util.*;
class Solution {
    public int maximumGap(int[] arr) {

        if(arr.length < 2){
            return 0;
        }
     
        Arrays.sort(arr);
        int gap = Integer.MIN_VALUE;

        for(int i = 1; i < arr.length; i++){
            int diff = arr[i] = arr[i - 1];
            gap = Math.max(gap, diff);
        }

        return gap;
    }
}