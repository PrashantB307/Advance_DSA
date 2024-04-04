

//   https://leetcode.com/problems/find-mode-in-binary-search-tree/


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
    HashMap<Integer, Integer> map;
    public int[] findMode(TreeNode root) {
        
        map = new HashMap<>();
        helper(root);

        int max = Integer.MIN_VALUE;
        for(int val : map.values()){
            max = Math.max(val, max);
        }

        int n = 0;
        for(int val : map.values()){
            if(val == max){
                n++;
            }
        }

        int i = 0;
        int[] ans = new int[n];
        for(int val : map.keySet()){
            if(map.get(val) == max){
                ans[i++] = val;
            }
        }

        return ans;
    }

    void helper(TreeNode node){
        if(node == null){
            return;
        }

        map.put(node.val, map.getOrDefault(node.val, 0) + 1);

        helper(node.left);
        helper(node.right);

    }
}