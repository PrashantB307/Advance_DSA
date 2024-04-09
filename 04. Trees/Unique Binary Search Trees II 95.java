

//    https://leetcode.com/problems/unique-binary-search-trees-ii/


import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;


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
    public List<TreeNode> generateTrees(int n) {

        return helper(1, n);
    }

    List<TreeNode> helper(int st, int end) {
        if(st > end){
            List<TreeNode> base = new ArrayList<>();
            base.add(null);
            return base;
        }

        List<TreeNode> ans = new ArrayList<>();
        for(int i = st; i <= end; i++){
            List<TreeNode> left = helper(st, i - 1);
            List<TreeNode> right = helper(i + 1, end);

            for(TreeNode l : left){
                for(TreeNode r : right){
                    TreeNode node = new TreeNode(i);
                    node.left = l;
                    node.right = r;

                    ans.add(node);
                }
            }
        }

        return ans;
    }

}