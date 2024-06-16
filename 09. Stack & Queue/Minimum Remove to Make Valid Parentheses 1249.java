

//   https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses

//   https://www.naukri.com/code360/problems/print-valid-string_3164683


import java.util.*;
class Solution {
    public String minRemoveToMakeValid(String s) {
        
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                st.push(i);
            }else if(ch == ')'){
                if(st.size() == 0){
                    sb.setCharAt(i, '#');
                }else{
                    st.pop();
                }
            }
        }

        while (st.size() != 0) {
            sb.setCharAt(st.pop(), '#');
        }

        return sb.toString().replaceAll("#", "");
    }
}