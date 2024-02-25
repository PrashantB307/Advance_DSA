

//   https://leetcode.com/problems/successful-pairs-of-spells-and-potions/


import java.util.*;
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        int n = spells.length;
        int m = potions.length;

        int[] ans = new int[n];
        Arrays.sort(potions);

        for (int i = 0; i < n; i++) {
            long spell = spells[i];
            int l = 0;
            int r = m - 1;

            while (l <= r) {
                int mid = l + (r - l) / 2;

                long prod = spell * potions[mid];
                if(prod >= success){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            }

            ans[i] = m - l;
        }

        return ans;
    }
}