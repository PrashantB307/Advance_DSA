

//   https://leetcode.com/problems/find-largest-value-in-each-tree-row/description/

//   https://www.geeksforgeeks.org/problems/largest-value-in-each-level/1

//   https://www.geeksforgeeks.org/problems/maximum-value--170645/1

//   https://www.codingninjas.com/studio/problems/largest-value-in-each-tree-row_1232659


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
    public List<Integer> largestValues(TreeNode root) {
        
        if(root == null){
            return new ArrayList<>();
        }

        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int len = q.size();
            int max = Integer.MIN_VALUE;

            for(int i = 0; i < len; i++){
                TreeNode node = q.remove();
                max = Math.max(max, node.val);

                if(node.left != null){
                    q.add(node.left);
                }

                if(node.right != null){
                    q.add(node.right);
                }
            }
            ans.add(max);
        }

        return ans;
    }
}