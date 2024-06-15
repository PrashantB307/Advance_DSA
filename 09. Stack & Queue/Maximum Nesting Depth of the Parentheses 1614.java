

//   https://www.geeksforgeeks.org/problems/maximum-nesting-depth-of-the-parentheses/1

//   https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/


import java.util.*;
class Solution {
    public int maxDepth(String s) {
        
        Stack<Character> st = new Stack<>();
        int oCnt = 0;
        int cCnt = 0;
        int max = 0; 

        for(char ch : s.toCharArray()){

            if(ch == '('){
                oCnt++;
                st.push(ch);
            }else if(ch == ')'){
                max = Math.max(max, oCnt);
                oCnt--;
            }
        }

        return max;
    }
}