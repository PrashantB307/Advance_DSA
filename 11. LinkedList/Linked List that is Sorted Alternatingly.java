

//    https://www.geeksforgeeks.org/problems/linked-list-that-is-sorted-alternatingly/1


import java.util.*;
class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class Solution {
    
   public Node sort(Node head){
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        
        while(temp != null){
            list.add(temp.data);
            temp = temp.next;
        }
        
        Collections.sort(list);
        
        Node curr = new Node(0);
        Node dummy = curr;
        
        for(int val : list){
            dummy.next = new Node(val);
            dummy = dummy.next;
        }
        
        return curr.next;
   }
}