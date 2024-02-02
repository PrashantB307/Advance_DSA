 

//    https://practice.geeksforgeeks.org/problems/insert-in-a-sorted-list/1


class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

class Solution {
    Node sortedInsert(Node head1, int key) {
        
        Node x = new Node(key);
        
        if(head1.data >= key){
            x.next = head1;
            return x;
        }
        
        Node node = head1;
        
        while(node.next != null){
            if(node.data < key && node.next.data >= key){
                x.next = node.next;
                node.next = x;
                return head1;
            }
            node = node.next;
        }
        
        node.next = x;
        
        return head1;
    }
}