

//   https://practice.geeksforgeeks.org/problems/find-the-sum-of-last-n-nodes-of-the-linked-list/1


class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
class Solution {
    
    //Return the sum of last k nodes
    public int sum(Node head, int k){
      int sz = 0;
      Node temp = head;
      
      while(temp != null){
          temp = temp.next;
          sz++;
      }
      
      int s = sz - k + 1;
      temp = head;
      while(--s > 0){
         temp = temp.next; 
      }
      
      int sum = 0;
      while(temp != null){
          sum += temp.data;
          temp = temp.next; 
      }
      
      return sum;
      
    }
}