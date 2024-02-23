

//   https://leetcode.com/problems/non-overlapping-intervals/

//   https://www.geeksforgeeks.org/problems/non-overlapping-intervals/1


//   https://www.codingninjas.com/studio/problems/non-overlapping-intervals_3169341


import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        if(intervals.length == 1){
            return 0;
        }

        Arrays.sort(intervals, (a, b) -> a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]);

        int minCnt = 0;
        int preEnd = Integer.MIN_VALUE;

        for(int[] interval : intervals){
            if(preEnd > interval[0]){
                minCnt++;
            }else{
                preEnd = interval[1];
            }
        }

        return minCnt;

    }
}