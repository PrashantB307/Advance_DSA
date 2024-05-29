

//   https://leetcode.com/problems/delete-nodes-and-return-forest/

//   https://www.naukri.com/code360/problems/delete-nodes-and-return-forest_1280135


import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class Solution {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        List<TreeNode> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        int[] arr = new int[1001];
        for(int val : to_delete){
            arr[val] = 1;
        }

        root = helper(root, arr, res);

        if(root != null){
            res.add(root);
        }

        return res;
    }

    public TreeNode helper(TreeNode node, int[] arr, List<TreeNode> res){
        if(node == null){
            return node;
        }

        node.left = helper(node.left, arr, res);
        node.right = helper(node.right, arr, res);

        if(arr[node.val] == 1){
            if(node.left != null){
                res.add(node.left);
                node.left = null;
            }

            if(node.right != null){
                res.add(node.right);
                node.right = null;
            }

            return null;
        }

        return node;
    }
}