

//     https://practice.geeksforgeeks.org/problems/delete-middle-of-linked-list/1

//     https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/

//     https://www.codingninjas.com/studio/problems/delete-middle-node_763267


class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

class Solution {
    Node deleteMid(Node head) {
        
        if(head == null || head.next == null){
            return null;
        }

        Node slow = head;
        Node fast = head;
        
        while(fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}