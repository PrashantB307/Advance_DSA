

//    https://leetcode.com/problems/maximum-binary-tree/description/

//    https://www.codingninjas.com/studio/problems/maximum-tree_1266104


class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] arr, int st, int end){
        if(st > end){
            return null;
        }

        int maxIdx = -1;
        int maxEle = Integer.MIN_VALUE;

        for(int  i = st; i <= end; i++){
            if(maxEle < arr[i]){
                maxEle = arr[i];
                maxIdx = i;
            }
        }

        TreeNode node = new TreeNode(maxEle);

        node.left = helper(arr, st, maxIdx - 1);
        node.right = helper(arr, maxIdx + 1, end);

        return node;
    }
}