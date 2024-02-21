

//     https://leetcode.com/problems/word-pattern/description/


import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        
        HashMap<Character, String> map = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            String wrd = words[i];

            if(map.containsKey(ch)){
                if(!map.get(ch).equals(wrd)){
                    return false;
                }
            }else{
                if(map.containsValue(wrd)){
                    return false;
                }
                map.put(ch, wrd);
            }
        }

        return true;
    }
}