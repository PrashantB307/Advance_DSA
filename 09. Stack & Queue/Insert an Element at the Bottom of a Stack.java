

//   https://www.geeksforgeeks.org/problems/insert-an-element-at-the-bottom-of-a-stack/1

//   https://www.codingninjas.com/studio/problems/insert-an-element-at-its-bottom-in-a-given-stack_1171166


import java.util.*;
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> stack = new Stack<>();
        while(st.size() > 0){
            stack.push(st.pop());
        }
        
        stack.push(x);
        
        while(stack.size() > 0){
            st.push(stack.pop());
        }
        
        return st;
        
    }
}