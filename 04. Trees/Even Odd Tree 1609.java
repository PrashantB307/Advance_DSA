

//   https://leetcode.com/problems/even-odd-tree/


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
    public boolean isEvenOddTree(TreeNode root) {
        if(root == null){
            return true;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;

        while (q.size() > 0) {
            int size = q.size();
            int prev = flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            for(int i = 0; i < size; i++){
                TreeNode node = q.remove();

                if(flag){
                    if(node.val % 2 == 0 || node.val <= prev){
                        return false;
                    }
                }else{
                    if(node.val % 2 != 0 || node.val >= prev){
                        return false;
                    }
                }

                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }

                prev = node.val;
            }

            flag = !flag;
        }

        return true;
    }
}