

//   https://leetcode.com/problems/make-the-string-great/


import java.util.*;
class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if (st.size() > 0 && Math.abs(ch - st.peek()) == 32) {
                st.pop();
            }else{
                st.push(ch);
            }
 
        }

        StringBuilder sb = new StringBuilder();
        while (st.size() > 0) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}