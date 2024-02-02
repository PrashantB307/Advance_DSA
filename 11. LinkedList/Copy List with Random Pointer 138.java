

//   https://leetcode.com/problems/copy-list-with-random-pointer/

//   https://www.geeksforgeeks.org/problems/clone-a-linked-list-with-next-and-random-pointer/1

//   https://www.codingninjas.com/studio/problems/clone-a-linked-list-with-random-pointers_983604


class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        
        copylist(head);
        copyRandomPointer(head);

        return extractcopy(head);
    }

    void copylist(Node head){
        Node curr = head;
        
        while (curr != null) {
            Node forw = curr.next;

            Node node = new Node(curr.val);
            curr.next = node;
            node.next = forw;

            curr = forw;
        }
    }

    void copyRandomPointer(Node head){
        Node curr = head;
        while (curr != null) {
            Node random = curr.random;

            if(random != null){
                curr.next.random = random.next;
            }

            curr = curr.next.next;
        }
    }


    Node extractcopy(Node head){

        Node dummy = new Node(-1);
        Node prev = dummy;
        Node curr = head;

        while (curr != null) {
            prev.next = curr.next;
            curr.next = curr.next.next;

            prev = prev.next;
            curr = curr.next;
        }

        return dummy.next;
    }
}