

//    https://leetcode.com/problems/reverse-prefix-of-word/


class Solution {
    public String reversePrefix(String word, char ch) {
        int i = 0;
        for(char c : word.toCharArray()){
            if(c == ch){
                break;
            }
            i++;
        }

        if(i == word.length()){
            return word;
        }
        
        String pre = word.substring(0,i +1);
        String post = word.substring(i+1);

        StringBuilder sb = new StringBuilder(pre);
        String ans = sb.reverse().toString() + post;

        return ans;
    }
}