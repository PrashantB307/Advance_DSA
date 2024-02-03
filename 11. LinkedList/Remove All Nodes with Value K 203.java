

//   https://leetcode.com/problems/remove-linked-list-elements/

//   https://www.codingninjas.com/studio/problems/remove-all-nodes-with-value-k_1262145


class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
};
class Solution {
    public static Node removeNodes(Node head, int k) {
        if(head == null){
            return null;
        }

        while(head != null && head.data == k){
            head = head.next;
        }

        Node temp = head;
        while(temp != null && temp.next != null){
            if(temp.next.data == k){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }

        return head;
    }
}