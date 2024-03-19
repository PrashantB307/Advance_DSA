

//   https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/submissions/


import java.util.*;
class Solution {
    public String greatestLetter(String s) {
    
        HashSet<Character> set = new HashSet<>();
    
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            set.add(ch);
        }

        for(char ch = 'Z'; ch >= 'A'; ch--){
            if(set.contains(ch) && set.contains((char)('a' + ( ch - 'A')))){
                return ch + "";
            }
        }

        return "";
        
    }
}