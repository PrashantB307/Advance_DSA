

//   https://www.geeksforgeeks.org/problems/deletion-and-reverse-in-linked-list/1


class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    Node reverse(Node head) {
        Node tail = head;

        while (tail.next != head) {
            tail = tail.next;
        }

        Node curr = head, prev = tail;

        do {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        } while (curr != head);

        return tail;
    }

    Node deleteNode(Node head, int key) {
        Node tail = head;
        
        while (tail.next != head) {
            tail = tail.next;
        }
        
        Node curr = head, prev = tail;
        
        do {
            if (curr.data == key) {
                Node temp = curr.next;
                curr.next = null;
                curr = temp;
                prev.next = curr;
                if (head.data == key){
                    return curr;
                }else{
                    return head;
                }  
            }
            
            prev = curr;
            curr = curr.next;
        } while (curr != head);
        
        return head;
    }
}