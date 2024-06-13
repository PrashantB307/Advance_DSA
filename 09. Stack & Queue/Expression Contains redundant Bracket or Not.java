

//   https://www.geeksforgeeks.org/problems/expression-contains-redundant-bracket-or-not/1


import java.util.*;
class Solution {
    public static int checkRedundancy(String s) {
        
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == ')'){
                int cnt = 0;

                while (st.size() > 0 && st.peek() != '(') {
                    st.pop();
                    cnt++;
                }

                if(cnt <= 1){
                    return 1;
                }else{
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }

        return 0;
    }
}
        
