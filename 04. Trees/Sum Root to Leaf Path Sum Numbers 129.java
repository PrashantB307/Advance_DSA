


//   https://leetcode.com/problems/sum-root-to-leaf-numbers/description/

//   https://www.geeksforgeeks.org/problems/root-to-leaf-paths-sum/1


class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

class Solution {
    public int sumNumbers(TreeNode root) {
        int ans = helper(root, "");

        return ans;
    }

    public int helper(TreeNode node, String str) {
        if (node.left == null && node.right == null) {
            str += node.val;
            return Integer.parseInt(str);
        }

        int l = 0, r = 0;
        if (node.left != null) {
            l = helper(node.left, str + node.val);
        }

        if (node.right != null) {
            r = helper(node.right, str + node.val);
        }

        return l + r;
    }
}

// XXXXXXXXXXXXXXXXXXXXXXXXXXXX=======> GFG <======XXXXXXXXXXXXXXXXXXXXXXXX


class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = null;
        right = null;
    }
}
class Tree1 {
    public static long treePathsSum(Node root) {
        long sum = 0;
        return dfssum(root, sum);
    }

    public static long dfssum(Node root, long sum) {
        if (root == null) {
            return 0;
        }

        sum = sum * 10 + root.data;

        if (root.left == null && root.right == null) {
            return sum;
        }

        return dfssum(root.left, sum) + dfssum(root.right, sum);
    }
}