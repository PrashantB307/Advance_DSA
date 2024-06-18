

//    https://leetcode.com/problems/minimum-increment-to-make-array-unique/


import java.util.*;
class Solution {
    public int minIncrementForUnique(int[] arr) {
        Arrays.sort(arr);
        int maxInc = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] <= arr[i - 1]){
                int inc = arr[i - 1] - arr[i] + 1;
                maxInc += inc;
                arr[i] =  arr[i - 1] + 1;
            }
        }

        return maxInc;
    }
}