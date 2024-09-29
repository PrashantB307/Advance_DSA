

//   https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/


import java.util.*;
class ListNode {
    int val;
    ListNode next;

    ListNode(int d) {
        val = d;
        next = null;
    }
}
class Solution {
    public ListNode doubleIt(ListNode head) {
        
        Stack<Integer> st = new Stack<>();
        int val = 0;

        while (head != null) {
            st.push(head.val);
            head = head.next;
        }

        ListNode newTail = null;

        while (!st.isEmpty() || val != 0) {
            newTail = new ListNode(0);   // Wrong Line
            // newTail = new ListNode(0, newTail);  Correct Line
            if (!st.isEmpty()) {
                val += st.pop() * 2;
            }

            newTail.val = val % 10;
            val /= 10;
        }

        return newTail;
    }
}