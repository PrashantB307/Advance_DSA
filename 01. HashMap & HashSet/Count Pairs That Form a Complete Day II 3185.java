

//   https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/


import java.util.*;
class Solution {
    public long countCompleteDayPairs(int[] hours) {

        HashMap<Integer, Integer> map = new HashMap<>();
        long cnt = 0;

        for (int hour : hours) {
            int rem = hour % 24;

            if (rem == 0) {
                cnt += map.getOrDefault(0, 0);
            } else {
                cnt += map.getOrDefault(24 - rem, 0);
            }

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return cnt;
    }
}