

//   https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

//   https://www.codingninjas.com/studio/problems/convert-sorted-array-to-bst_1264995


class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        
        int n = nums.length;
        return createBST(nums, 0, n - 1);
    }

    TreeNode createBST(int[] nums, int l, int r){

        if(l > r){
            return null;
        }

        int mid = l + (r - l) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = createBST(nums, l, mid - 1);
        node.right = createBST(nums, mid + 1, r);

        return node;
    }
}