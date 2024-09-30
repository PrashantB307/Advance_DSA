

//   https://www.geeksforgeeks.org/problems/intersection-of-two-linked-list/1


import java.util.*;
class Node {
    int data;
    Node next;

    Node(int a) {
        data = a;
        next = null;
    }
}

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        HashSet<Integer> set = new HashSet<>();
        Node temp = head2;

        while (temp != null) {
            set.add(temp.data);
            temp = temp.next;
        }

        Node tem1 = head1;
        Node ne = new Node(0);
        Node ab = ne;
        
        while (tem1 != null) {
            if (set.contains(tem1.data)) {
                Node n = new Node(tem1.data);
                ne.next = n;
                ne = ne.next;
            }

            tem1 = tem1.next;
        }

        return ab.next;
    }
}