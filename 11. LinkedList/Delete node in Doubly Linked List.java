

//   https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1


class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}

class Solution {
    public Node deleteNode(Node head, int x) {

        if(x == 1){
            Node temp = head.next;
            return temp;
        }

        Node temp = head;
        int cnt = 1;

        while (cnt < x) {
            temp = temp.next;
            cnt++;
        }

        temp.prev.next = temp.next;
        if(temp.next != null){
            temp.next.prev = temp.prev;
        }

        return head;
    }
}
