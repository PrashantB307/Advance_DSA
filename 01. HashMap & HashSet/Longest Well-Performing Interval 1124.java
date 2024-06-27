

//   https://leetcode.com/problems/longest-well-performing-interval/


import java.util.*;
class Solution {
    public int longestWPI(int[] hours) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < hours.length; i++) {
            sum += (hours[i] > 8) ? 1 : -1;

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            if (sum > 0) {
                ans = i + 1;
            } else if (map.containsKey(sum - 1)) {
                ans = Math.max(ans, i - map.get(sum - 1));
            }
        }

        return ans;
    }
}