

//    https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1

//    https://www.codingninjas.com/studio/problems/reverse-a-doubly-linked-list_1116098


class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Solution {
    public static Node reverseDLL(Node head) {

        Node pre = null;
        Node curr = head;

        while(curr != null){
            Node temp = curr.next;
            curr.next = pre;
            curr.prev = temp;
            pre = curr;
            curr = temp;
        }

        return pre;
    }
}