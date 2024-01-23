

//   https://practice.geeksforgeeks.org/problems/preorder-to-postorder4423/1


class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }

    public static Node post_order(int pre[], int size) {
        Node root = null;

        for (int val : pre) {
            root = bst(root, val);
        }

        return root;
    }

    public static Node bst(Node node, int val) {
        if (node == null) {
            node = new Node(val);
            return node;
        }

        if (node.data > val) {
            node.left = bst(node.left, val);
        } else {
            node.right = bst(node.right, val);
        }

        return node;
    }
}
