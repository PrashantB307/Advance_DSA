

//  https://leetcode.com/problems/heaters/description/


import java.util.*;
class Solution {
    public int findRadius(int[] houses, int[] heaters) {

        Arrays.sort(heaters);
        int ans = 0;

        for (int val : heaters) {
            int lo = 0;
            int hi = heaters.length - 1;
            int js = -1;
            int jl = -1;

            while (lo <= hi) {
                int mid = (lo + hi) / 2;

                if (heaters[mid] == val) {
                    js = heaters[mid];
                    jl = heaters[mid];
                    break;
                } else if (heaters[mid] < val) {
                    js = heaters[mid];
                    lo = mid + 1;
                } else {
                    jl = heaters[mid];
                    hi = mid - 1;
                }
            }

            int d1 = (js == -1) ? Integer.MAX_VALUE : val - js;
            int d2 = (jl == -1) ? Integer.MAX_VALUE : jl - val;

            int dis = Math.min(d1, d2);
            ans = Math.max(ans, dis);
        }

        return ans;
    }
}