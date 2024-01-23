

//   https://practice.geeksforgeeks.org/problems/valid-expression1025/1


import java.util.*;
class Solution {
    boolean valid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.size() == 0) {
                    st.push(ch);
                } else if ((ch == ')' && st.peek() == '(') ||
                        (ch == '}' && st.peek() == '{') ||
                        (ch == ']' && st.peek() == '[')) {
                    st.pop();
                }else{
                    return false;
                }
            }
        }

        if(st.size() == 0){
            return true;
        }

        return false;
    }
}