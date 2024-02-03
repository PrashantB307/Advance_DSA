

//    https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/


import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
} 

class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int max = 0;
        int l = 0;
        int r = list.size() - 1;

        while(l <= r){
            int sum = list.get(l) + list.get(r);
            max = Math.max(max, sum);
            l++;
            r--;
        }

        return max;
    }
}