

//   https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/


import java.util.*;
class Solution {
    public String reverseParentheses(String s) {
        
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(sb.length());
            } else if (ch == ')') {
                int start = st.pop();
                reverse(sb, start, sb.length() - 1);
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public void reverse(StringBuilder sb, int st, int end) {
        while (st < end) {
            char temp = sb.charAt(st);
            sb.setCharAt(st++, sb.charAt(end));
            sb.setCharAt(end--, temp);
        }
    }
}