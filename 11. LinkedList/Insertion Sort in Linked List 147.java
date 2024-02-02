

//   https://leetcode.com/problems/insertion-sort-list/

//   https://practice.geeksforgeeks.org/problems/insertion-sort-for-singly-linked-list/1

//   https://www.codingninjas.com/studio/problems/insertion-sort-in-linked-list_1090544
 

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode insertionSortList(ListNode head) {
        
        ListNode dummy = new ListNode(-1);
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            ListNode prev = dummy;
            ListNode nxt = dummy.next;

            while (nxt != null) {
                if(nxt.val > curr.val){
                    break;
                }

                prev = nxt;
                nxt = nxt.next;
            }

            curr.next = nxt;
            prev.next = curr;
            curr = temp;
        }

        return dummy.next;
    }
}