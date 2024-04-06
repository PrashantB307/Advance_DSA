

//   https://leetcode.com/problems/minimum-depth-of-binary-tree/description/

//   https://www.geeksforgeeks.org/problems/minimum-depth-of-a-binary-tree/1



class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}
class Solution {
    int depth;
    public int minDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 1;
        }
        
        depth = Integer.MAX_VALUE;
        helper(root.left, 1);
        helper(root.right, 1);

        return depth + 1;
    }

    public void helper(TreeNode node, int min){
        if(node == null){
            return;
        }

        if(node.left == null && node.right == null){
            depth = Math.min(min, depth);
        }

        helper(node.left, min + 1);
        helper(node.right, min + 1);
    }
}