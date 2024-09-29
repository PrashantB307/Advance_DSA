

//   https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/


import java.util.*;
class ListNode {
    int data;
    ListNode next;

    ListNode(int d) {
        data = d;
        next = null;
    }
}
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        if(head == null || head.next == null || head.next.next == null){
            return new int[]{-1, -1};
        }

        ArrayList<Integer> criticalPnt = new ArrayList<>();
        
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = head.next.next;
        int idx = 1;

        while (next != null) {
            if((curr.data > prev.data && curr.data > next.data) ||(curr.data < prev.data && curr.data < next.data)){
                criticalPnt.add(idx);
            }

            prev = curr;
            curr = next;
            next = next.next;
            idx++;
        }

        if(criticalPnt.size() < 2){
            return new int[]{-1, -1};
        }

        int minDis = Integer.MAX_VALUE;
        int maxDis = criticalPnt.get(criticalPnt.size() - 1) - criticalPnt.get(0);

        for(int i = 1; i < criticalPnt.size(); i++){
            minDis = Math.min(minDis, criticalPnt.get(i) - criticalPnt.get(i - 1));
        }

        return new int[]{minDis, maxDis};
    }
}