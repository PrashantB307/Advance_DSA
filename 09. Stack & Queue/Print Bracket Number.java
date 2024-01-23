

//   https://practice.geeksforgeeks.org/problems/print-bracket-number4058/1

//   https://www.codingninjas.com/studio/problems/bracket-number_1229411


import java.util.*;
class Solution {
    ArrayList<Integer> bracketNumbers(String S) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            
            if(ch == '('){
                j++;
                st.push(j);
                res.add(j);
                
            }
            if(ch == ')'){
                res.add(st.pop());
               
            }
        }
        
        return res;
    }
};