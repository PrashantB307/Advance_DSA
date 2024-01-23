

//     https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/description/

//     https://practice.geeksforgeeks.org/problems/three-consecutive-duplicates2434/1



import java.util.*;
class Solution {
    public String removeDuplicates(String s, int k) {
        
        Stack<Integer> count = new Stack<>();
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(st.size() > 0 && st.peek() == ch){
                count.push(count.peek());
            }else{
                count.push(1);
            }

            st.push(ch);

            if(count.peek() == k){
                for(int j = 0; j < k; j++){
                    st.pop();
                    count.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while(st.size() > 0){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}