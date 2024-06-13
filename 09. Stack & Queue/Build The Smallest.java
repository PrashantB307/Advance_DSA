

//   https://www.geeksforgeeks.org/problems/build-the-smallest2841/1


import java.util.*;
class Solution {
    static String buildLowestNumber(String str, int k) {
        
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            while (st.size() > 0 && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }

            st.push(ch);
        }

        while (st.size() > 0 && k > 0) {
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (st.size() > 0) {
            sb.append(st.pop());
        }

        int n = sb.length();

        for(int i = n - 1; i >= 0; i--){
            if(sb.charAt(i) != '0'){
                break;
            }

            if(sb.charAt(i) == '0'){
                sb.deleteCharAt(i);
            }
        }

        if(sb.length() == 0){
            return "0";
        }else{
            return sb.reverse().toString();
        }
    }
}