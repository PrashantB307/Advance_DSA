

//   https://leetcode.com/problems/next-greater-node-in-linked-list/

//   https://www.codingninjas.com/studio/problems/next-greater-node-in-linked-list_1262083


import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
} 

class Solution {
    public int[] nextLargerNodes(ListNode head) {
        
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        ListNode node = head;
        int sz = 0;

        while(node != null){
            sz++;
            list.add(node.val);
            node = node.next;
        }

        int[] ans = new int[sz];

        for(int i = list.size() - 1; i >= 0; i--){
            while (st.size() > 0 && st.peek() <= list.get(i)) {
                st.pop();
            }

            if(st.size() == 0){
                ans[i] = 0;
            }else{
                ans[i] = st.peek();
            }

            st.push(list.get(i));
        }

        return ans;
    }
}