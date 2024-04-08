

//   https://www.geeksforgeeks.org/problems/sum-of-nodes-within-k-distance-from-target--170637/1

//   https://www.geeksforgeeks.org/problems/valentine-sum--141631/1


class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class solver {
    static int sum;

    static int sum_at_distK(Node root, int target, int k) {
        sum = 0;
        find(root, target, k);
        return sum;
    }

    static int find(Node root, int target, int k) {
        if (root == null)
            return -1;
        if (root.data == target) {
            sum(root, k);
            return k - 1;
        }

        int left = find(root.left, target, k);
        if (left != -1) {
            sum += root.data;
            sum(root.right, left - 1);
            return left - 1;
        }
        int right = find(root.right, target, k);
        if (right != -1) {
            sum += root.data;
            sum(root.left, right - 1);
            return right - 1;
        }
        return -1;
    }

    static void sum(Node root, int k) {
        if (k < 0 || root == null)
            return;

        sum += root.data;
        sum(root.left, k - 1);
        sum(root.right, k - 1);
    }
}