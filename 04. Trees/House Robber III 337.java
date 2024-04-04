

//   https://leetcode.com/problems/house-robber-iii/description/

//   https://www.codingninjas.com/studio/problems/amusement-park_1280139


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

    HashMap<TreeNode, Integer> map = new HashMap<>();

    public int rob(TreeNode root) {

        if(root == null){
            return 0;
        }

        if(map.containsKey(root)){
            return map.get(root);
        }

        int sum = root.val;

        if(root.left != null){
            sum += rob(root.left.left);
            sum += rob(root.left.right);
        }

        if(root.right != null){
            sum += rob(root.right.left);
            sum += rob(root.right.right);
        }

        int next_sum = rob(root.left) + rob(root.right);
        
        int res = Math.max(sum, next_sum);
        map.put(root, res);

        return res;
    }
}