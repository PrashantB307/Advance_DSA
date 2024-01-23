

//   https://practice.geeksforgeeks.org/problems/geeks-and-the-string--170645/1

//   https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/

//   https://www.codingninjas.com/studio/problems/remove-consecutive-duplicates_893195


import java.util.*;
class Solution {
    public static String removePair(String s) {
       
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            
            if(st.size() > 0 && st.peek() == ch){
                st.pop();
            }else{
                st.push(ch);
            } 
        }
        
        if(st.size() == 0){
            return "-1";
        }
        
        while(st.size() > 0){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}