

//   https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/



class ListNode {
    int val;
    ListNode next;
}

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;

        while(--k > 0){
            fast = fast.next;
        } 

        ListNode first = fast;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        swap(first, slow);
        return head;
    }

    void swap(ListNode l1, ListNode l2){
        int temp = l1.val;
        l1.val = l2.val;
        l2.val = temp;
    }
}