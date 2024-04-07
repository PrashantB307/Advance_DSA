

//   https://leetcode.com/problems/path-sum-ii/

//   https://www.codingninjas.com/studio/problems/finding-paths_1281314


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
    List<List<Integer>> ans;
    public List<List<Integer>> pathSum(TreeNode root, int tar) {
        
        ans = new ArrayList<>();
        helper(root, tar, 0, new ArrayList<>());

        return ans;
    }

    void helper(TreeNode node, int tar, int sum, ArrayList<Integer> list){
        if(node == null){
            return;
        }

        list.add(node.val);
        sum += node.val;
        if(sum == tar && node.left == null && node.right == null){
            ans.add(new ArrayList<>(list));
        }

        helper(node.left, tar, sum, list);
        helper(node.right, tar, sum, list);

        list.remove(list.size() - 1);
    }
}