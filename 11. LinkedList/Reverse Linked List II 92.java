

//     https://leetcode.com/problems/reverse-linked-list-ii/submissions/1101324119/


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
} 
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode curr = head;
        ListNode prev = null;
        int count = 1;

        while(count != left){
            prev = curr;
            curr = curr.next;
            count++;
        }

        ListNode start = curr;
        while(count != right){
            curr = curr.next;
            count++;
        }

        ListNode rest = curr.next;
        curr.next = null;
        
        ListNode newNode = reverse(start);

        if(prev != null){
            prev.next = newNode;
        }

        curr = newNode;

        while ( curr.next != null) {
            curr = curr.next;
        }

        curr.next = rest;

        if(left == 1){
            return newNode;
        }else{
            return head;
        }
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode temp = null;

        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}