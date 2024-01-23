

//   https://leetcode.com/problems/valid-parentheses/description/

//   https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1

//   https://www.codingninjas.com/studio/problems/valid-parenthesis_795104
 


import java.util.*;
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                
                char top = st.pop();
                if((top == '(' && ch != ')') || (top == '{' && ch != '}') || (top == '[' && ch != ']')){
                return false;
               }
            }
        }
        
        return st.isEmpty();
    }
}