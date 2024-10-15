

//  https://leetcode.com/problems/detect-capital/


class Solution {
    public boolean detectCapitalUse(String word) {
        int cap = 0;
        int sm = 0;

        for(char ch : word.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                sm++;
            }else{
                cap++;
            }
        }

        if(cap == word.length()){
            return true;
        }else if(sm == word.length()){
           return  true;
        }else if(sm == word.length() - 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'){
            return true;
        }

        return false;
    }
}