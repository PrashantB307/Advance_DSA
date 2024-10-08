

//     https://www.geeksforgeeks.org/problems/xor-linked-list/1


import java.util.*;
class Node {
    int data;
    Node npx;

    Node(int x) {
        data = x;
        npx = null;
    }
}
class Solution {
    static Node insert(Node head, int data) {
        Node curr = new Node(data);
        if(head == null){
            head = curr;
            return head;
        } 

        curr.npx = head;
        head = curr;

        return head;
    }

    static ArrayList<Integer> getList(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.data);
            head = head.npx;
        }

        return list;
    }
}