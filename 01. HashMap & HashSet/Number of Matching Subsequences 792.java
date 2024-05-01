

//   https://leetcode.com/problems/number-of-matching-subsequences/


import java.util.*;
class Solution {
    public int numMatchingSubseq(String s, String[] words) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String str : words) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        int ans = 0;

        for (String str : map.keySet()) {
            int i = 0;
            int j = 0;

            while (i < s.length() && j < str.length()) {
                if (s.charAt(i) == str.charAt(j)) {
                    i++;
                    j++;
                } else {
                    i++;
                }
            }

            if (j == str.length()) {
                ans += map.get(str);
            }
        }

        return ans;
    }
}