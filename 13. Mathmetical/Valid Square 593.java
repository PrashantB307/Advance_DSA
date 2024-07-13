

//   https://leetcode.com/problems/valid-square/


import java.util.*;
class Solution {

    HashSet<Integer> set;
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        set = new HashSet<>();

        if (!helper(p1, p2) || !helper(p1, p3) || !helper(p1, p4)
                || !helper(p2, p3) || !helper(p2, p4) || !helper(p3, p4)) {
            return false;
        }

        return set.size() == 2 ? true : false;
    }

    public boolean helper(int[] a, int[] b) {
        if (a[0] == b[0] && a[1] == b[1]) {
            return false;
        }

        int dx = a[0] - b[0];
        int dy = a[1] - b[1];

        int dist = dx * dx + dy * dy;
        set.add(dist);

        return true;
    }
}