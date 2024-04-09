

//   https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/


class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        
        return helper(root, 0);
    }

    int helper(TreeNode node, int sum){
        if(node == null){
            return 0;
        }

        sum = 2 * sum + node.val;
        if(node.left == null && node.right == null){
            return sum;
        }
        
        int leftSum = helper(node.left, sum);
        int rightSum = helper(node.right, sum);

        return leftSum + rightSum;
    }
}