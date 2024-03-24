

//   https://leetcode.com/problems/apple-redistribution-into-boxes/


import java.util.*;
class Solution {
    public int minimumBoxes(int[] apple, int[] c) {
        Arrays.sort(c);
        int sum = Arrays.stream(apple).sum();
        int sum2 = 0;
        int ans = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            sum2 += c[i];
            ans++;
            if (sum2 >= sum) {
                break;
            }
        }
        return ans;
    }
}