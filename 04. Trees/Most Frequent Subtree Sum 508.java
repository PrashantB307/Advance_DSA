

//   https://leetcode.com/problems/most-frequent-subtree-sum/


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
    int max;
    public int[] findFrequentTreeSum(TreeNode root) {
        
        map = new HashMap<>();
        max = Integer.MIN_VALUE;

        if(root == null){
            return new int[]{};
        }

        helper(root);

        ArrayList<Integer> list = new ArrayList<>();
        for(int val : map.keySet()){
            if(map.get(val) == max){
                list.add(val);
            }
        }

        int[] ans = new int[list.size()];
        int i = 0;
        for(int val : list){
            ans[i++] = val;
        }

        return ans;
    }

    void helper(TreeNode node){
        if(node == null){
            return;
        }

        helper(node.left);
        helper(node.right);

        int sum = node.val;

        if(node.left != null){
            sum += node.left.val;
        }

        if(node.right != null){
            sum += node.right.val;
        }

        map.put(sum, map.getOrDefault(sum, 0) + 1);

        node.val = sum;
        max = Math.max(map.get(sum), max);
    }

}