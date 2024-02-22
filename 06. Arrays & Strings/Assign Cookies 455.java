

//   https://leetcode.com/problems/assign-cookies/

//   https://www.geeksforgeeks.org/problems/assign-cookies/1


import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        int index = 0;
        int cnt = 0;
        
        while (index < s.length && cnt < g.length) {
            if (s[index] >= g[cnt]) {
                cnt++;
            }
            index++;
        }
        
        return cnt;
    }
}
