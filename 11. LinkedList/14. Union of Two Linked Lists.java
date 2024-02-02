

//   https://practice.geeksforgeeks.org/problems/union-of-two-linked-list/1


import java.util.*;
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Sol {
    public static Node findUnion(Node h1, Node h2) {
      
        HashSet<Integer> set = new HashSet<>();

        while(h1 != null){
            set.add(h1.data);
            h1 = h1.next;
        }

        while(h2 != null){
            set.add(h2.data);
            h2 = h2.next;
        }

        Node curr = null;
        Node head = null;

        for(int val : set){
            Node newNode = new Node(val);

            if(curr == null){
                head = newNode;
                curr = head;
            }else{
                curr.next = newNode;
                curr = newNode;
            }
        }

        return head;
    }
}