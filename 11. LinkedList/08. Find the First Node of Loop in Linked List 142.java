

//   https://leetcode.com/problems/linked-list-cycle-ii/

//   https://practice.geeksforgeeks.org/problems/find-the-first-node-of-loop-in-linked-list--170645/1

//   https://www.codingninjas.com/studio/problems/detect-the-first-node-of-the-loop_1112628


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                fast = head;
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }

                return fast;  
            }
        }

        return null;
    }
}