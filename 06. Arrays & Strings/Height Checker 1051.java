

//   https://leetcode.com/problems/height-checker/description/


import java.util.*;
class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = heights.clone();
        Arrays.sort(heights);

        int cnt = 0;

        int i = 0;
        for(int val : arr){
            if(val != heights[i++]){
                cnt++;
            }
        }

        return cnt;
    }
}