

//  https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/description/

//  https://www.geeksforgeeks.org/problems/find-largest-word-in-dictionary2430/1


import java.util.*;
class Solution {
    public String findLongestWord(String s, List<String> dict) {
        
        dict.sort((String a, String b) -> 
            a.length() == b.length() ? a.compareTo(b) : b.length() - a.length());

        String ans = "";

        for(String str : dict){
            if(isContain(s, str)){
                return ans = str;
            }
        }

        return ans;
    }

    boolean isContain(String s, String d){
        if(d.length() > s.length()){
            return false;
        }

        int i = 0;
        int j = 0;

        while (i < s.length() && j < d.length()) {
            if(s.charAt(i) == d.charAt(j)){
                j++;
            }

            i++;
        }

        return j == d.length();
    }
}