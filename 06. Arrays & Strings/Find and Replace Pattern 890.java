

//   https://leetcode.com/problems/find-and-replace-pattern/


import java.util.*;
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> list = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            boolean flag = true;

            for(int j = 0; j < words[i].length(); j++){
                if(words[i].indexOf(words[i].charAt(j)) != pattern.indexOf(pattern.charAt(j))){
                    flag = false;
                    break;
                }
            }

            if(flag){
                list.add(words[i]);
            }
        }

        return list;
    }
}