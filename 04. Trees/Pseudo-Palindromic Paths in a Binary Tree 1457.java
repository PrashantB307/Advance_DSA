

//    https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/


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

    int cnt = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        
        HashSet<Integer> set = new HashSet<>();
        helper(root, set);

        return cnt;
    }

    public void helper(TreeNode node, HashSet<Integer> set){
        if(node == null){
            return;
        }

        if(set.contains(node.val)){
            set.remove(node.val);
        }else{
            set.add(node.val);
        }

        if(node.left == null && node.right == null){
            if(set.size() == 0 || set.size() == 1){
                cnt++;
            }
        }

        helper(node.left, new HashSet<>(set));
        helper(node.right, new HashSet<>(set));
    }
}