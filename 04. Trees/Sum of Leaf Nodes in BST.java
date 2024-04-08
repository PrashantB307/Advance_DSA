

class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
class Solution
{
    static int sum;
    public static int sumOfLeafNodes(Node root)
    {
        sum = 0;
        helper(root);

        return sum;
    }

    public static void helper(Node node){
        if (node == null) {
            return;
        }

        if(node.left == null && node.right == null){
            sum += node.data;
        }

        helper(node.left);
        helper(node.right);
    }
}