

//   https://www.geeksforgeeks.org/problems/stack-using-two-queues/1


import java.util.*;
class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    void push(int a)
    {
	   q1.add(a);
    }
    
    int pop()
    {
        if(q1.size() == 0){
            return -1;
        }   

        while (q1.size() >= 2) {
            q2.add(q1.remove());
        }

        int val = q1.remove();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return val;
    }
}

