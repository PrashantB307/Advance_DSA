

//    https://leetcode.com/problems/minimum-absolute-difference-in-bst/

//    https://leetcode.com/problems/minimum-distance-between-bst-nodes/


class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

class Solution {
    int min;
    int prev = -1;
    public int getMinimumDifference(TreeNode root) {
        min = Integer.MAX_VALUE;
        

        helper(root);

        return min;
    }

    void helper(TreeNode node){
        if(node == null){
            return;
        }

        helper(node.left);
        if(prev != -1){
            min = Math.min(min, Math.abs(prev - node.val));
        }

        prev = node.val;
        helper(node.right);

    }
}