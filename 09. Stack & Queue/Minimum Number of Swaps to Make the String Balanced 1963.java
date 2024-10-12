

//    https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/


import java.util.*;
class Solution {
    public int minSwaps(String s) {
        
        Stack<Character> st = new Stack<>();
        int cnt = 0;

        for(char ch : s.toCharArray()){
            if(ch == '['){
                st.push(ch);
            }else{
                if(st.size() > 0 && st.peek() == '['){
                    st.pop();
                }else{
                    cnt++;
                }
            }
        }

        return (cnt + 1) / 2;
    }
}