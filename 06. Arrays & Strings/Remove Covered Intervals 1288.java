

//   https://leetcode.com/problems/remove-covered-intervals/


import java.util.*;
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);

        int cnt = 1;
        int idx = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][1] > intervals[idx][1]) {
                cnt++;
                idx = i;
            }
        }

        return cnt;
    }
}