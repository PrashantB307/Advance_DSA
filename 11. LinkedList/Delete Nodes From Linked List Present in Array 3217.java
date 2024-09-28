

//   https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/


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
    public ListNode modifiedList(int[] nums, ListNode head) {

        Set<Integer> set = new HashSet<>();
        for (int val : nums) {
            set.add(val);
        }

        ListNode curr = new ListNode(-1);
        ListNode temp = curr;

        while (head != null) {
            if (!set.contains(head.val)) {
                temp.next = head;
                temp = temp.next;
            }

            head = head.next;
        }

        temp.next = null;

        return curr.next;
    }
}