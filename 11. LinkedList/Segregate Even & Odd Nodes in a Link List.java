

//   https://practice.geeksforgeeks.org/problems/segregate-even-and-odd-nodes-in-a-linked-list5035/1

//   https://www.codingninjas.com/studio/problems/segregate-even-and-odd-nodes-in-a-linked-list_1116100?leftPanelTab=1
 

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
class Solution{
    Node divide(int N, Node head){
        
        Node even = new Node (0);
        Node evenHead = even;
        
        Node odd = new Node (0);
        Node oddHead = odd;
        
        Node temp = head;
        while(temp != null){
            if(temp.data % 2 == 0){
                even.next = temp;
                even = even.next;
            }else{
                odd.next = temp;
                odd = odd.next;
            }
            temp = temp.next;
        }
        
        even.next = oddHead.next;
        odd.next = null;
        
        return evenHead.next;
        
    }
}