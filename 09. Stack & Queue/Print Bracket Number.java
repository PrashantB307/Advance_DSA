

//   https://www.geeksforgeeks.org/problems/print-bracket-number4058/1


import java.util.*;
class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int k = 1;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '('){
                list.add(k);
                st.push(k);
                k++;
            }else if(ch == ')'){
                list.add(st.pop());
            }
        }

        return list;
    }
};