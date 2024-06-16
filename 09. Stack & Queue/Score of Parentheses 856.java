

//   https://leetcode.com/problems/score-of-parentheses/description/

//   https://www.naukri.com/code360/problems/ninja-s-parentheses_1475038


import java.util.*;
class Solution {
    public int scoreOfParentheses(String s) {
        int cnt = 0;
        Stack<Integer> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(cnt);
                cnt = 0;
            }else{
                cnt = st.pop() + Math.max(2 * cnt, 1);
            }
        }

        return cnt;
    }
}