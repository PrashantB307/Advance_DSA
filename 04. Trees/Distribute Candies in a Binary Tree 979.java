

//   https://www.geeksforgeeks.org/problems/distribute-candies-in-a-binary-tree/1

//   https://leetcode.com/problems/distribute-coins-in-binary-tree/


class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Solution
{
    static int ans;
    public static int distributeCandy(Node root)
    {
        ans = 0;
        helper(root);

        return ans;
    }

    static int helper(Node node){
        if(node == null){
            return 0;
        }

        int left = helper(node.left);
        int right = helper(node.right);

        ans += Math.abs(left) + Math.abs(right);

        return node.data - 1 + left + right;
    }
}