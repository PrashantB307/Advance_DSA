

//   https://leetcode.com/problems/keyboard-row/


import java.util.*;
class Solution {
    public String[] findWords(String[] words) {

        String one = "qwertyuiopQWERTYUIOP";
        String two = "asdfghjklASDFGHJKL";
        String three = "zxcvbnmZXCVBNM";

        ArrayList<String> ans = new ArrayList<>();

        for(String str : words){
            if(isContains(str, one) || isContains(str, two) || isContains(str, three)){
                ans.add(str);
            }
        }

        String[] res = new String[ans.size()];
        int i = 0;
        for(String s : ans){
            res[i++] = s;
        }

        return res;
    }

    boolean isContains(String str, String key){

        for(char ch : str.toCharArray()){
            boolean flag = false;
            for(char ch2 : key .toCharArray()){
                if(ch == ch2){
                    flag = true;
                    break;
                }
            }

            if(!flag){
                return false;
            }
        }

        return true;
    }
}