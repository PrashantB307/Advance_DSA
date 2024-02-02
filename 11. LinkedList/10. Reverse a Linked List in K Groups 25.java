

//   https://leetcode.com/problems/reverse-nodes-in-k-group/description/

//   https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1

//   https://www.codingninjas.com/studio/problems/reverse-list-in-k-groups_983644


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        int length = getLength(head);
        
        return reverse(head, k, length);
    }

    ListNode reverse(ListNode head, int k, int sz){

        if(sz < k){
            return head;
        }
        
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = new ListNode();
        int c = 0;

        while (curr != null && c < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            c++;
        }

        if(next != null){
            head.next = reverse(next, k, sz - k);
        }

        return prev;
    }

    int getLength(ListNode head){
        int sz = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        return sz;
    }

}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX====>     GFG     <=====XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX



class Solution2 {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        int length = getLength(head);
        
        return reverse(head, k, length);
    }

    ListNode reverse(ListNode head, int k, int sz){

        if(sz < k){
            return head;
        }
        
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = new ListNode();
        int c = 0;

        while (curr != null && c < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            c++;
        }

        if(next != null){
            head.next = reverse(next, k, sz - k);
        }

        return prev;
    }

    int getLength(ListNode head){
        int sz = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        return sz;
    }

}