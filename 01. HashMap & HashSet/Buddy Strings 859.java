

//   https://leetcode.com/problems/buddy-strings/


import java.util.*;
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length())
            return false;

        int diff = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i))
                diff++;
        }

        if (diff == 2) {
            int firstIndex = 0;
            int secondIndex = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    firstIndex = i;
                    break;
                }
            }

            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) != goal.charAt(i)) {
                    secondIndex = i;
                    break;
                }
            }

            if (s.charAt(secondIndex) == goal.charAt(firstIndex) && s.charAt(firstIndex) == goal.charAt(secondIndex)) {
                return true;
            }
        }

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++)
            set.add(s.charAt(i));

        if (diff == 0 && s.length() != set.size()) {
            return true;
        }

        return false;
    }
}