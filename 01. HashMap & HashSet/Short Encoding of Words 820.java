

//   https://leetcode.com/problems/short-encoding-of-words/


import java.util.*;
class Solution {
    public int minimumLengthEncoding(String[] words) {
        
        HashSet<String> set = new HashSet<>();
        for(String str : words){
            set.add(str);
        }

        for(String s : words){
            for(int i = 1; i < s.length(); i++){
                set.remove(s.substring(i));
            }
        }

        int len = 0;
        for(String s : set){
            len += s.length() + 1;
        }

        return len;
    }
}