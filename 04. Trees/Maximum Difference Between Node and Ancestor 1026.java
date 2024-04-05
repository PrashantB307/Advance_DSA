

//   https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/

//   https://www.geeksforgeeks.org/problems/maximum-difference-between-node-and-its-ancestor/1


class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

class Solution {
    public int maxAncestorDiff(TreeNode root) {
        int minv = root.val;
        int maxv = root.val;
        return findMax(root, minv, maxv);
    }

    public int findMax(TreeNode root, int minv, int maxv) {
        if (root == null) {
            return Math.abs(minv - maxv);
        }
        minv = Math.min(minv, root.val);
        maxv = Math.max(maxv, root.val);

        int l = findMax(root.left, minv, maxv);
        int r = findMax(root.right, minv, maxv);

        return Math.max(l, r);
    }
}

//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX=======>   GFG    <=======XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Node
{
    int data;
    Node left, right;
    
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class Tree
{
    //Function to return the maximum difference between any 
    //node and its ancestor.
    int res;
    int maxDiff(Node root){
        res=Integer.MIN_VALUE;
        md(root,root.data);
        return res;
    }
    int md(Node root,int max){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 0;
        }
        if(max<root.data){
            max=root.data;
        }
        if(root.left==null && root.right==null){
            res=Math.max(max-root.data,res);
            return root.data;
        }
        else{
            int a=Integer.MIN_VALUE,b=Integer.MIN_VALUE;
            if(root.left!=null){
                a=max-root.left.data;
            }
            if(root.right!=null){
                b=max-root.right.data;
            }
            int c = Math.max(a,b);
            res=Math.max(c,res);
            return Math.max(a,b);
        }
    }
}