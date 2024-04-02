

//   https://leetcode.com/problems/count-good-nodes-in-binary-tree/


class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

class Solution {
    public int goodNodes(TreeNode root) {
        if(root == null){
            return 0;
        }

        return helper(root, Integer.MIN_VALUE);
    }

    int helper(TreeNode node, int max){
        if (node == null){
            return 0;
        }
        
        int ans = 0;
        
        if(node.val >= max){
            ans = 1;
        }

        max = Math.max(max, node.val);
        int left = helper(node.left, max);
        int right = helper(node.right, max);
        ans += left + right;

        return ans;
    }
}