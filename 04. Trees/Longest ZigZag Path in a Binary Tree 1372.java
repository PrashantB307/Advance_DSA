

//    https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree

//    https://www.codingninjas.com/studio/problems/longest-zigzag-path-in-binary-tree_2674164


class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

class Solution {
    
    int max = 0;
    public int longestZigZag(TreeNode root) {
        
        traverse(root.left, 0, 1);
        traverse(root.right, 1, 1);

        return max;
    }

    void traverse(TreeNode node, int dir, int len){
        if(node == null){
            return;
        }

        max = Math.max(max, len);

        if(dir == 0){
            traverse(node.left, dir, 1);
            traverse(node.right, 1, len + 1);
        }else{
            traverse(node.left, 0, len + 1);
            traverse(node.right, dir, 1);
        }
    }
}