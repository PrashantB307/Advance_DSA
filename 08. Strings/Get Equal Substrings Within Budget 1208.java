

//   https://leetcode.com/problems/get-equal-substrings-within-budget/

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        int i = 0, j = 0;
        int len = 0;
        int diff = 0;

        while (i < s.length()) {
            diff += Math.abs(s.charAt(i) - t.charAt(i));
            
            while (diff > maxCost) {
                diff -= Math.abs(s.charAt(j) - t.charAt(j));
                j++;
            }

            len = Math.max(len, i - j + 1);
            i++;
        }

        return len;
    }
}