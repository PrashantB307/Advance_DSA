

//    https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1

//    https://leetcode.com/problems/merge-two-sorted-lists/description/

//    https://www.codingninjas.com/studio/problems/merge-two-sorted-linked-lists_800332



class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {

    Node sortedMerge(Node head1, Node head2) {

        Node temp = new Node(0);
        Node curr = temp;

        while (head1 != null && head2 != null) {
            if (head1.data > head2.data) {
                curr.next = head2;
                head2 = head2.next;
            } else {
                curr.next = head1;
                head1 = head1.next;
            }
            curr = curr.next;
        }

        if (head1 != null) {
            curr.next = head1;
        } else {
            curr.next = head2;
        }

        return temp.next;
    }
}
