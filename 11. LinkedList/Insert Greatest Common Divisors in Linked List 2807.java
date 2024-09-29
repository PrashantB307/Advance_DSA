

//   https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/


class ListNode {
    int val;
    ListNode next;

    ListNode(int d) {
        val = d;
        next = null;
    }
}
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;

        while (temp != null && temp.next != null) {
            int gcd = findGCD(temp.val, temp.next.val);
            
            ListNode newNode = new ListNode(gcd);
            newNode.next = temp.next;
            temp.next = newNode;
            
            temp = newNode.next;
        }

        return head;
    }

    public int findGCD(int a, int b){
        if(b == 0){
            return a;
        }

        return findGCD(b, a % b);
    }
}