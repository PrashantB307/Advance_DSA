

//   https://leetcode.com/problems/kth-largest-sum-in-a-binary-tree/


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
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            long sum = 0;

            while (size-- > 0) {
                TreeNode temp = q.poll();
                sum += temp.val;
                
                if (temp.left != null){
                    q.add(temp.left);
                }
                    
                if (temp.right != null){
                    q.add(temp.right);
                }
            }

            pq.add(sum);
            
            if (pq.size() > k){
                pq.poll();
            }        
        }

        return pq.size() < k ? -1 : pq.peek();
    }
}