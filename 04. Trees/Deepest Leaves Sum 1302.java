

//    https://leetcode.com/problems/deepest-leaves-sum/


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

    int sum;
    int levSum;
    public int deepestLeavesSum(TreeNode root) {
        
        sum = 0;
        levSum = 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (q.size() > 0) {
            int s = q.size();

            for(int i = 0; i < s; i++){
                TreeNode node = q.remove();

                if(node.left == null && node.right == null){
                    levSum += node.val;
                }

                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }

            sum = levSum;
            levSum = 0;
        }

        return sum;
    }
}