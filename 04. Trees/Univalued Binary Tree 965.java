

//   https://leetcode.com/problems/univalued-binary-tree/


import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}
class Solution {
    HashSet<Integer> set;
    public boolean isUnivalTree(TreeNode root) {
        
        set = new HashSet<>();
        helper(root);

        if(set.size() > 1){
            return false;
        }

        return true;
    }

    void helper(TreeNode node){
        if(node == null){
            return;
        }

        if(!set.contains(node.val)){
            set.add(node.val);
        }
    
        helper(node.left);
        helper(node.right);
    }
}