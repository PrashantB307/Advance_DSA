

//    https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/


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
    int minLevel = 1;
    public int maxLevelSum(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int max = Integer.MIN_VALUE;
        int level = 1;

        while (q.size() > 0) {
            int n = q.size();
            int sum = 0;

            for(int i = 0; i < n; i++){
                TreeNode curr = q.remove();
                sum += curr.val; 

                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }

            if(sum > max){
                max = sum;
                minLevel = level;
            }

            level++;
        }

        return minLevel;
    }
}