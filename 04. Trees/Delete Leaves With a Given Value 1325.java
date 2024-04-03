

//    https://leetcode.com/problems/delete-leaves-with-a-given-value/description/
  
//    https://www.codingninjas.com/studio/problems/delete-leaf-nodes-with-value-x_630465


class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}
class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
    
        return helper(root, target);
    }

    TreeNode helper(TreeNode node, int tar){
        if(node == null){
            return null;
        }

        node.left = helper(node.left, tar);
        node.right = helper(node.right, tar);
        
        if(node.val == tar && node.left == null && node.right == null ){
            return null;
        }

        return node;
    }
}