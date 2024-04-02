

//   https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/

//   https://www.geeksforgeeks.org/problems/sorted-list-to-bst/1


class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}
class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode middle = getMiddle(head);
        TreeNode node = new TreeNode(middle.val);

        if(middle == head){
            return node;
        }

        node.left = sortedListToBST(head);
        node.right = sortedListToBST(middle.next);

        return node;
    }

    public ListNode getMiddle(ListNode head){
        ListNode s = head;
        ListNode f = head;
        ListNode priv = null;

        while (f != null && f.next != null) {
            priv = s;
            s = s.next;
            f = f.next.next;
        }

        if(priv != null){
            priv.next = null;
        }

        return s;
    }
}