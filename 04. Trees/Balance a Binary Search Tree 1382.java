

//    https://leetcode.com/problems/balance-a-binary-search-tree/


import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

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
    public TreeNode balanceBST(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);

        return constructBST(list, 0, list.size() - 1);
    }

    public void inOrder(TreeNode node, ArrayList<Integer> list){
        if(node == null){
            return;
        }
        
        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }

    public TreeNode constructBST(ArrayList<Integer> list, int i, int j){

        if(i > j){
            return null;
        }

        int mid = i + (j - i) / 2;

        TreeNode node = new TreeNode(list.get(mid));
        node.left = constructBST(list, i, mid - 1);
        node.right = constructBST(list, mid + 1, j);

        return node;
    }
}