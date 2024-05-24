

//    https://leetcode.com/problems/unique-morse-code-words/


import java.util.*;
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();

        for(String str : words){
            StringBuilder sb = new StringBuilder();
            for(char ch : str.toCharArray()){
                sb.append(code[ch - 'a']);
            }

            set.add(sb.toString());
        }

        return set.size();
    }
}