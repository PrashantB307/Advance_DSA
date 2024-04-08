

//    https://leetcode.com/problems/sum-of-left-leaves/description/

//    https://www.geeksforgeeks.org/problems/sum-of-left-leaf-nodes/1


class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}
class Solution {
    int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;

        helper(root.left, true);
        helper(root.right, false);

        return sum;
    }

    void helper(TreeNode node, boolean flag){
        if(node == null){
            return;
        }

        if(node.left == null && node.right == null && flag == true){
            sum += node.val;
        }

        helper(node.left, true);
        helper(node.right, false);
    }
}