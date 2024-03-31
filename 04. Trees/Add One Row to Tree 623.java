

//    https://leetcode.com/problems/add-one-row-to-tree/


import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }

    public TreeNode(int val2, TreeNode root, Object object) {
        //TODO Auto-generated constructor stub
    }
}
class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1)
            return new TreeNode(val, root, null);

        Queue<TreeNode> queue = new LinkedList<>();
        int level = 1;

        queue.offer(root);

        while(!queue.isEmpty() && depth > level) {
            int size = queue.size();

            for(int i = 0; i < size; ++i) {
                TreeNode curr = queue.poll();

                if(depth - 1 == level) {
                    curr.left = new TreeNode(val, curr.left, null);
                    curr.right = new TreeNode(val, null, curr.right);
                } else {
                    if(curr.left != null)
                        queue.offer(curr.left);

                    if(curr.right != null)
                        queue.offer(curr.right);
                }
            }

            level++;
        }

        return root;
    }
}