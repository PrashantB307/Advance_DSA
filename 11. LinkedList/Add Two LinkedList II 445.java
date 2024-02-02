

//   https://leetcode.com/problems/add-two-numbers-ii/


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        
        ListNode l1 = reverse(head1);
        ListNode l2 = reverse(head2);

        ListNode head = null;
        ListNode tail = null;

        int carry = 0;
       

        while(l1 != null || l2 != null || carry == 1){
            int res = carry;
            
            if(l1 != null){
                res += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                res += l2.val;
                l2 = l2.next;
            }

            int data = res % 10;
            carry = res / 10;

            if(head == null){
                head = tail = new ListNode(data); 
            }else{
                tail.next = new ListNode(data);
                tail = tail.next;
            }
        }

        return reverse(head);
        
    }

    ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        } 

        return prev;
    }
}