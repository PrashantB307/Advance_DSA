

//    https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1 

//    https://leetcode.com/problems/reverse-linked-list/description/

//    https://www.codingninjas.com/studio/problems/reverse-linked-list_920513


class Node {
    int data;
    Node next;
}

class Solution {
    Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}

// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX======>   Using Recursion   <=========XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {
    public Node reverseList(Node head) {

        left = head;
        helper(head);

        return head;
    }

    boolean work = true;
    Node left;

    void helper(Node right) {

        if (right == null) {
            return;
        }

        helper(right.next);

        if (work) {
            if (left == right || left.next == right) {
                work = false;
            }

            int temp = left.data;
            left.data = right.data;
            right.data = temp;

            left = left.next;
        }

    }
}
