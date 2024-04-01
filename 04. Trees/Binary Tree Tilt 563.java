

//   https://leetcode.com/problems/binary-tree-tilt/

//   https://www.geeksforgeeks.org/problems/tilt-of-binary-tree/1


class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}
class Solution {
    int diff = 0;
    public int findTilt(TreeNode root) {
    
        helper(root);

        return diff;
    }

    public int helper(TreeNode node){
        if(node == null){
            return 0;
        }

        if(node.left == null && node.right == null){
            return node.val;
        }

        int left = helper(node.left);
        int right = helper(node.right);

        diff += Math.abs(right - left);

        return left + right + node.val;
    }
}