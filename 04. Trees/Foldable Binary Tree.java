

//    https://www.geeksforgeeks.org/problems/foldable-binary-tree/1


class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}

class Tree {
    boolean IsFoldable(Node node) {

        if (node == null) {
            return true;
        }

        if (node.left == null && node.right == null) {
            return true;
        }

        if (node.left == null || node.right == null) {
            return false;
        }

        return isMirror(node.left, node.right);
    }

    public boolean isMirror(Node A, Node B) {

        if (A == null && B == null) {
            return true;
        }
        if (A == null || B == null) {
            return false;
        }

        if ((A.left == null && B.left == null) && (A.right == null && B.right == null)) {
            return true;
        }

        if ((A.left == null && B.left == null) || (A.right == null && B.right == null)) {
            return false;
        }

        if ((A.left == null && B.right == null) || (A.right == null && B.left == null)) {
            return true;
        }

        return isMirror(A.left, B.right) && isMirror(A.right, B.left);
    }
}