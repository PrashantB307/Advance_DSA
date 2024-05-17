

//    https://leetcode.com/problems/longest-nice-substring/


import java.util.*;
class Solution {
    public String longestNiceSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            set.add(ch);
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(set.contains(Character.toUpperCase(ch)) && set.contains(Character.toLowerCase(ch))){
                continue;
            }

            String s1 = longestNiceSubstring(s.substring(0, i));
            String s2 = longestNiceSubstring(s.substring(i + 1));

            return s1.length() >= s2.length() ? s1 : s2;
        }

        return s;
    }
}