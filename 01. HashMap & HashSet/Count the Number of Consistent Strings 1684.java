

//   https://leetcode.com/problems/count-the-number-of-consistent-strings/


import java.util.*;
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        Set<Character> set = new HashSet<>();
        for(char ch : allowed.toCharArray()){
            set.add(ch);
        }

        int cnt = 0;

        for(String str : words){
            for(char ch : str.toCharArray()){
                if(!set.contains(ch)){
                    cnt++;
                    break;
                }
            }
        }

        return words.length - cnt;
    }
}