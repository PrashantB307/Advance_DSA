

//   https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/description/


import java.util.*;
class Solution {
    public int countCharacters(String[] words, String chars) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : chars.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int ans = 0;
        for(String str : words){
            HashMap<Character, Integer> m = new HashMap<>();
            for(char ch : str.toCharArray()){
                m.put(ch, m.getOrDefault(ch, 0) + 1);
            }

            int len = 0;
            for(char ch : str.toCharArray()){
                int x = m.getOrDefault(ch, 0);
                int y = map.getOrDefault(ch, 0);
    
                if(x <= y){
                    len++;
                }else{
                    break;
                }
            }

            if(len == str.length()){
                ans += str.length();
            }
        }

        return ans;
    }
}