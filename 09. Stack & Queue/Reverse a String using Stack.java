

//    https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1

//    https://www.codingninjas.com/studio/problems/reverse-the-string_799927


import java.util.*;
class Solution {
    
    public String reverse(String S){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            st.push(ch);
        }
        
        StringBuilder sb = new StringBuilder();
        while(st.size() > 0){
            sb.append(st.pop());
        }
        
        return sb.toString();
    }

}
