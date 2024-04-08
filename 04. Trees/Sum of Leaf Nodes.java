

//   https://www.geeksforgeeks.org/problems/sum-of-leaf-nodes/1


class Node {
    int data;
    Node left, right;
}

class GfG {
    int sum;

    public int SumofLeafNodes(Node root) {
        sum = 0;
        helper(root);

        return sum;
    }

    void helper(Node node) {
        if (node == null) {
            return;
        }

        helper(node.left);
        helper(node.right);

        if (node.right == null && node.left == null) {
            sum += node.data;
        }
    }
}