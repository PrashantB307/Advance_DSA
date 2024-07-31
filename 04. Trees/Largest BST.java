

//   https://www.geeksforgeeks.org/problems/largest-bst/1


class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}

class Solution {

    public static class Gnode {
        int min;
        int max;
        int val;

        Gnode(int min, int max, int val) {
            this.min = min;
            this.max = max;
            this.val = val;
        }
    }

    static int largestBst(Node root) {

        return helper(root).val;
    }

    public static Gnode helper(Node root) {

        if (root == null) {
            return new Gnode(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }

        Gnode left = helper(root.left);
        Gnode right = helper(root.right);

        if (left.max < root.data && root.data < right.min) {
            return new Gnode(Math.min(left.min, root.data), Math.max(right.max, root.data), left.val + right.val + 1);
        }

        return new Gnode(Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(left.val, right.val));

    }
}
