

//   https://leetcode.com/problems/reorder-list/

//   https://practice.geeksforgeeks.org/problems/reorder-list/1

//   https://www.codingninjas.com/studio/problems/rearrange-linked-list_764146?leftPanelTabValue=PROBLEM



class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
} 
class Solution {
    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null){
            return;
        }

        left = head;
        helper(head);
    }

    boolean work = true;
    ListNode left; 
    
    void helper(ListNode right){
        if(right == null){
            return;
        }

        helper(right.next);

        if(work == true){
            if(left == right || left.next == right){
                right.next = null;
                work = false;
            }else{
                ListNode next = left.next;

                left.next = right;
                right.next = next;

                left = next;
            }
        }
    }
}