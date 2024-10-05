

//   https://leetcode.com/problems/split-linked-list-in-parts/


class ListNode {
    int val;
    ListNode next;

    ListNode(int d) {
        val = d;
        next = null;
    }
}
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        ListNode[] ans = new ListNode[k];

        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int len = size / k;
        int remLen = size % k;

        ListNode curr = head;
        ListNode prev = curr;

        for(int i = 0; i < k; i++){
            ListNode newNode = curr;

            int currSize = len;
            if(remLen > 0){
                currSize += remLen; 
            }

            int j = 0;
            while (j++ < currSize) {
                prev = curr;
                curr = curr.next;
            }

            if(prev != null){
                prev.next = null;
            }

            ans[i] = newNode;
        }

        return ans;
    }
}