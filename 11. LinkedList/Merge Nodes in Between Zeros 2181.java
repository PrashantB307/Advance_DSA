

//   https://leetcode.com/problems/merge-nodes-in-between-zeros/

//   https://www.naukri.com/code360/problems/sum-between-zeroes_630463


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
    public ListNode mergeNodes(ListNode head) {
        
        if(head.val == 0){
            head = head.next;
        }

        ListNode curr = head;
        ListNode temp = head;

        int sum = 0;

        while (temp != null) {
            if(temp.val != 0){
                sum += temp.val;
                temp = temp.next;
            }else{
                curr.val = sum;
                curr.next = temp.next;
                temp = curr.next;
                curr = curr.next;
                sum = 0;
            }
        }

        return head;

    }
}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {
    public ListNode mergeNodes(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp = head.next;

        int sum = 0;
        while (temp != null) {
            if(temp.val == 0){
                
                list.add(new ListNode(sum));
                sum = 0;
            }else{
                sum += temp.val;
            }

            temp = temp.next;
        }

        ListNode node = list.get(0);
        ListNode curr = node;
        
        for (int i = 1; i < list.size(); i++) {
            curr.next = list.get(i);
            curr = curr.next;
        }

        return node;
    }
}