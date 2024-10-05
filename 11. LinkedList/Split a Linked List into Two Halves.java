

//   https://www.geeksforgeeks.org/problems/split-a-circular-linked-list-into-two-halves/1


class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public Pair<Node, Node> splitList(Node head) {
        if (head == null || head.next == head)
            return new Pair<Node, Node>(head, head);

        Node fast = head;
        Node slow = head;

        while (fast.next != head && fast.next.next != head) {
            fast = fast.next.next;
            slow = slow.next;
        }

        Node head1 = head;
        Node head2 = slow.next;

        slow.next = head1;

        fast = head2;

        while (fast.next != head){
            fast = fast.next;
        }
            
        fast.next = head2;

        return new Pair<Node, Node>(head1, head2);
    }
}