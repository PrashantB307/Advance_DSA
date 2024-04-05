

//    https://www.geeksforgeeks.org/problems/max-and-min-element-in-binary-tree/1


class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}

class Solution {
    public static int findMax(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int l = findMax(root.left);
        int r = findMax(root.right);
        
        return (int) Math.max((Math.max(l, r)), root.data);
    }

    public static int findMin(Node root) {
     
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int l = findMin(root.left);
        int r = findMin(root.right);
        
        return (int) Math.min((Math.min(l, r)), root.data);
    }
}