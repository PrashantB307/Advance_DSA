

//    https://leetcode.com/problems/removing-stars-from-a-string/description/


import java.util.*;
class Solution {
    public String removeStars(String s) {
        
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '*'){
                st.pop();
            }else{
                st.push(ch);
            }
        }

        if(st.size() == 0){
            return "";
        }

        StringBuilder sb = new StringBuilder();
        while(st.size() > 0){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}