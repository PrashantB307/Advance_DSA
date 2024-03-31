

//   https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/description/


class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}
class Solution {
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        
        if(root != null){
            bstToGst(root.right);
            sum += root.val;
            root.val = sum;
            bstToGst(root.left);
        }

        return root;
    }
}