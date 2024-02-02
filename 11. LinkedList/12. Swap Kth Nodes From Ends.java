

//   https://www.geeksforgeeks.org/problems/swap-kth-node-from-beginning-and-kth-node-from-end-in-a-singly-linked-list/1

//   https://www.codingninjas.com/studio/problems/swapping-nodes_2425460


class Node  {
     int data;
     Node next;
     Node(int data)
     {
         this.data = data;
         next = null;
     }
}
class GFG
{
    Node swapkthnode(Node head, int num, int k)
    {
       if(k > num){
           return head;
       }
       
       Node start = head;
       Node sPrev = null;
       
       Node end = head;
       Node ePrev = null;
       
       for(int i = 0; i < k - 1; i++){
           sPrev = start;
           start = start.next;
       }
       
       for(int i = 0; i < num - k; i++){
           ePrev = end;
           end = end.next;
       }
       
       if(sPrev != null){
           sPrev.next = end;
       }
       
       if(ePrev != null){
           ePrev.next = start;
       }
       
       Node temp = start.next;
       start.next = end.next;
       end.next = temp;
       
       if(k == 1){
           head = end;
       }
       
       if(k == num){
           head = start;
       }
       
       return head;
       
    }
}