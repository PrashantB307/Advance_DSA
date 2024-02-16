

//    https://practice.geeksforgeeks.org/problems/maximum-number-of-characters-between-any-two-same-character4552/1

//    https://leetcode.com/problems/largest-substring-between-two-equal-characters/description/


import java.util.*;
class Solution {
    public int maxChars(String s) {
        int ans = -1;
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            if (map.isEmpty()) {
                map.put(s.charAt(i), i);
            } else if (map.containsKey(s.charAt(i))) {
                ans = Math.max(ans, i - map.get(s.charAt(i)) - 1);
            } else{
                map.put(s.charAt(i), i);
            }
                
        }
        
        return ans;
    }
}