
import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> levelSum = new ArrayList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int n = q.size();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                sum += node.val;
                
                if (node.left != null){
                    q.offer(node.left);
                } 

                if (node.right != null){
                    q.offer(node.right);
                } 
            }

            levelSum.add(sum);
        }

        q.offer(root);
        root.val = 0;
        int level = 0;

        while (!q.isEmpty()) {
            int n = q.size();
            int nextLevelSum = (level + 1 < levelSum.size()) ? levelSum.get(level + 1) : 0;

            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                int childSum = 0;

                if (node.left != null) {
                    childSum += node.left.val;
                    q.offer(node.left);
                }
                if (node.right != null) {
                    childSum += node.right.val;
                    q.offer(node.right);
                }

                if (node.left != null){
                    node.left.val = nextLevelSum - childSum;
                } 
                if (node.right != null){
                    node.right.val = nextLevelSum - childSum;
                } 
            }
            level++;
        }

        return root;
    }
}