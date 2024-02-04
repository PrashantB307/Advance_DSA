
 
//    https://leetcode.com/problems/rotate-list/description/

//    https://www.codingninjas.com/studio/problems/rotate-linked-list_920454?leftPanelTab=0
 

class ListNode {
    int val;
    ListNode next;
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || k < 0){
            return head;
        }


        int size = 0;
        ListNode tail = head;
        while(tail.next != null){
            size++;
            tail = tail.next;
        }
        size++;

        tail.next = head;
        int rotatation = size - k % size;

        tail = head;
        while(rotatation-- > 1){
            tail = tail.next;
        }

        head = tail.next;
        tail.next = null;

        return head;

    }
}