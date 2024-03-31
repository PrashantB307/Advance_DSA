

//    https://leetcode.com/problems/binary-tree-pruning/


class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        
        helper(root);
        if(root.val == 0  && root.left == null && root.right == null ){
            return null;
        }

        return root;
    }

    void helper(TreeNode node){
        if(node == null){
            return;
        }

        if(!contains(node.left)){
            node.left = null;
        }

        if(!contains(node.right)){
            node.right = null;
        }

        helper(node.left);
        helper(node.right);
    }

    boolean contains(TreeNode node){
        if(node == null){
            return false;
        }

        if(node.val == 1){
            return true;
        }

        boolean l = contains(node.left);
        boolean r = contains(node.right);

        return l || r;
    }
}