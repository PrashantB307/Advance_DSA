

//   https://www.geeksforgeeks.org/problems/sum-of-the-longest-bloodline-of-a-tree/1


class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}

class Solution {

    public void getHeight(Node node, int sum, int ht, int[] ans) {
        if (node == null) {
            if (ht > ans[0]) {
                ans[0] = ht;
                ans[1] = sum;
            } else if (ht == ans[0]) {
                if (ans[1] < sum)
                    ans[1] = sum;
            }

            return;
        }

        getHeight(node.left, sum + node.data, ht + 1, ans);
        getHeight(node.right, sum + node.data, ht + 1, ans);

    }

    public int sumOfLongRootToLeafPath(Node root) {
        int[] ans = new int[2];
        getHeight(root, 0, 0, ans);

        return ans[1];
    }
}