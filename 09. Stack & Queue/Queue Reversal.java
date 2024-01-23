

//    https://practice.geeksforgeeks.org/problems/queue-reversal/1

//    https://www.codingninjas.com/studio/problems/reversing-queue_1170046


import java.util.*;
class GfG{
    
    public Queue<Integer> rev(Queue<Integer> q){
    
        Stack<Integer> st = new Stack<>();
        while(q.size() > 0){
            st.push(q.remove());
        }

        while(st.size() > 0){
            q.add(st.pop());
        }

        return q;
    }
}