

//   https://leetcode.com/problems/create-binary-tree-from-descriptions/


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
    public TreeNode createBinaryTree(int[][] descriptions) {
        
        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashSet<Integer> children = new HashSet<>();

        for(int[] disc : descriptions){
            int parent = disc[0];
            int child = disc[1];
            boolean isLeft = disc[2] == 1 ? true : false;

            TreeNode prntNode = null;
            TreeNode childNode = null;

            if(map.containsKey(parent)){
                prntNode = map.get(parent);
            }else{
                prntNode = new TreeNode(parent);
            }

            if(map.containsKey(child)){
                childNode = map.get(child);
            }else{
                childNode = new TreeNode(child);
            }

            if(isLeft){
                prntNode.left = childNode;
            }else{
                prntNode.right = childNode;
            }

            map.put(parent, prntNode);
            map.put(child, childNode);

            children.add(child);
        }

        TreeNode root = null;
        for(int[] desc : descriptions){
            if(!children.contains(desc[0])){
                root = map.get(desc[0]);
                break;
            }
        }

        return root;
    }
}