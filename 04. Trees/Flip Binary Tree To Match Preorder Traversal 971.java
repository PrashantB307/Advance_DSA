

//   https://leetcode.com/problems/flip-binary-tree-to-match-preorder-traversal/description/


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
    List<Integer> list;
    int i;
    int[] v;
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        
        list = new ArrayList<>();
        i = 0;
        v = voyage;
        
        return dfs(root) ? list : Arrays.asList(-1);
    }

    public boolean dfs(TreeNode node){
        if(node == null){
            return true;
        }

        if(node.val != v[i++]){
            return false;
        }

        if(node.left != null && node.left.val != v[i]){
            list.add(node.val);
            return dfs(node.right) && dfs(node.left);
        }else{
            return dfs(node.left) && dfs(node.right);
        }
    }
}