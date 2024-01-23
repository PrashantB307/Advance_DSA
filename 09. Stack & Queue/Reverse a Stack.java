

//    https://practice.geeksforgeeks.org/problems/reverse-a-stack/1

//    https://www.codingninjas.com/studio/problems/reverse-stack-using-recursion_631875



import java.util.*;
class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        Queue<Integer> q = new ArrayDeque<>();
        
        while(!s.empty()){
            q.add(s.pop());
        }
        
        while(!q.isEmpty()){
            s.push(q.remove());
        }
    }
}