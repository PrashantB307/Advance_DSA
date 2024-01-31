

//   https://leetcode.com/problems/add-two-numbers/description/


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = null;
        ListNode tail = null;

        int carry = 0;

        while(l1 != null || l2 != null || carry == 1){

            int res = carry;

            if(l1 != null){
                res += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                res += l2.val;
                l2 = l2.next;
            }

            int data = res % 10;
            carry = res / 10;

            if(head == null){
                head = tail = new ListNode(data);
            }else{
                tail.next = new ListNode(data);
                tail = tail.next;
            }
        }

        return head;

    }
}


// XXXXXXXXXXXXXXXXXXXXXXXXXXXXX=======>    GFG     <=========XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
class Solution2{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        Node l1 = reverse(first);
        Node l2 = reverse(second);
        
        Node head = null;
        Node tail = null;
       
        int carry = 0;

        while(l1 != null || l2 != null || carry == 1){

            int res = carry;

            if(l1 != null){
                res += l1.data;
                l1 = l1.next;
            }

            if(l2 != null){
                res += l2.data;
                l2 = l2.next;
            }

            int data = res % 10;
            carry = res / 10;

            if(head == null){
                head = tail = new Node(data);
            }else{
                tail.next = new Node(data);
                tail = tail.next;
            }
        }

        return reverse(head);

    }
    
    static Node reverse(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null)
        {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}