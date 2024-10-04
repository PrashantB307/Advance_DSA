

//   https://www.geeksforgeeks.org/problems/sorted-insert-for-circular-linked-list/1


class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
class Solution {
    public Node sortedInsert(Node head, int data) {
        Node node = new Node(data);
        if(head == null){
            node.next = node;
            return node;
        }

        if(head.data >= data){
            node.next = head;
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }

            temp.next = node;
            return node;
        }
    
        Node temp = head;
        while(temp.next != head && temp.next.data < data){
           temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;
    
        return head;
    }
}