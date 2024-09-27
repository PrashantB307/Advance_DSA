

//   https://www.geeksforgeeks.org/problems/absolute-list-sorting/1

//   https://www.naukri.com/code360/problems/sort-linked-list_920517


import java.util.*;
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    Node sortList(Node head) {

        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;

        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        Collections.sort(list);

        Node head1 = null;
        Node tail = null;

        for (int val : list) {
            Node node = new Node(val);

            if (head1 == null) {
                head1 = tail = node;
            } else {
                while (tail.next != null) {
                    tail = tail.next;
                }

                tail.next = node;
                tail = node;
            }
        }

        return head1;

    }
}