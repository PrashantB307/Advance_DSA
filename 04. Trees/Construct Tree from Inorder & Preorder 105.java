

//   https://www.geeksforgeeks.org/problems/construct-tree-1/1

//   https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/


class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

class Solution {
    
    public static Node buildTree(int inorder[], int preorder[], int n) {
        
        return binaryTree(inorder, preorder, 0, 0, n - 1);
    }

    public static Node binaryTree(int in[], int pre[], int preInd, int start, int end) {
        if (start > end) {
            return null;
        }
        
        Node root = new Node(pre[preInd]);

        int inInd = 0;
        for (int i = start; i <= end; i++) {
            if (in[i] == root.data) {
                inInd = i;
                break;
            }
        }
        
        root.left = binaryTree(in, pre, preInd + 1, start, inInd - 1);
        root.right = binaryTree(in, pre, preInd + 1 + inInd - start, inInd + 1, end);
        
        return root;
    }
}