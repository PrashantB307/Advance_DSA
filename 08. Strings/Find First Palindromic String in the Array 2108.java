

//   https://leetcode.com/problems/find-first-palindromic-string-in-the-array/


class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String str : words){
            if(isPalindrome(str)){
                return str;
            }
        }
        return "";
    }

    boolean isPalindrome(String s){
        if(s.length() == 1){
            return true;
        }

        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}