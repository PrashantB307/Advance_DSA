

//   https://leetcode.com/problems/evaluate-boolean-binary-tree/


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class Solution {
    public boolean evaluateTree(TreeNode root) {
        return postOrder(root);
    }

    public boolean postOrder(TreeNode node){

        if(node.left == null && node.right == null){
            return node.val == 0 ? false : true; 
        }
        
        boolean f1 = postOrder(node.left);
        boolean f2 = postOrder(node.right);

        
        if(node.val == 2){
            return f1 | f2;
        }else if(node.val == 3){
            return f1 & f2;
        }

        return false;
    }
}