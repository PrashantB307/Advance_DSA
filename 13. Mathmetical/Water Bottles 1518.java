

//   https://leetcode.com/problems/water-bottles/


class Solution {
    public int numWaterBottles(int full, int empty) {
        
        int ans = full;

        while (full >= empty) {
            int extra = full / empty;
            int rem = full % empty;
            ans += extra;
            full = extra + rem;
        }

        return ans;

    }
}