

//   https://leetcode.com/problems/average-of-levels-in-binary-tree/

//   https://www.codingninjas.com/studio/problems/averages-of-levels-in-binary-tree_893192


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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        double sum = 0;
        
        while (q.size() > 0) {
            int n = q.size();
            sum = 0;

            for(int i = 0; i < n; i++){
                TreeNode node = q.remove();
                sum += node.val;

                if(node.left != null){
                    q.add(node.left);
                }

                if(node.right != null){
                    q.add(node.right);
                }
            }

            double avg = sum / n;
            res.add(avg);
        }

        return res;
    }
}