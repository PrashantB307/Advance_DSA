

//    https://practice.geeksforgeeks.org/problems/sort-a-stack/1

//    https://www.codingninjas.com/studio/problems/sort-a-stack_985275?leftPanelTab=3


//========================>  GFG   <============================

import java.util.*;
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
	    Stack<Integer> st = new Stack<>();
	   
		while(s.size() > 0){
		    int val = s.pop();
		    
		    while(st.size() > 0 && st.peek() > val){
		        s.push(st.pop());
		    }
		    
		    st.push(val);
		    
		}
		
		return st;
	}
}


//========================>  Coding Ninja   <============================


class Solution {

	public static void sortStack(Stack<Integer> stack) {
		if(stack.isEmpty()){
			return;
		}

        int top = stack.pop();
        sortStack(stack);
        if(stack.isEmpty()){
            stack.push(top);
        } else{
            Stack<Integer> temp = new Stack<>();
            while(!stack.isEmpty() && stack.peek() > top){
                temp.push(stack.pop());
            }
            stack.push(top);
            while(!temp.isEmpty()){
                stack.push(temp.pop());
            }

        }
	}

}