

//    https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1

//    https://leetcode.com/problems/middle-of-the-linked-list/description/


 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

class Solution
{
    int getMiddle(Node head)
    {
        Node forw = head;
        Node back = head;
        
        while(forw != null && forw.next != null){
            forw = forw.next.next;
            back = back.next;
        }
        
        return back.data;
    }
}
