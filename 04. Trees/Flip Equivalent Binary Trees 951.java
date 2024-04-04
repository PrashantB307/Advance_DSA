

//  https://leetcode.com/problems/flip-equivalent-binary-trees/description/

//  https://www.codingninjas.com/studio/problems/flip-equivalent-binary-tree_1234687


class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if ((root1 == null && root2 != null) || (root2 == null && root1 != null)){
            return false;
        }

        if (root1 == root2){
            return true;
        }     

        if (root1.val == root2.val) {
            if (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right))
            {
                return true;
            }else if (flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left)){
                return true;
            }
        }

        return false;
    }
}