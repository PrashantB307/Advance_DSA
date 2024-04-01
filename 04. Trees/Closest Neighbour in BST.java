

//   https://www.geeksforgeeks.org/problems/closest-neighbor-in-bst/1


class Node
{
    int key;
    Node left, right;

    Node(int x)
    {
        key = x;
        left = right = null;
    }

}
class Solution {
    static int ans;
    public static int findMaxForN(Node root, int n) {

        ans = -1; 
        helper(root, n);

        return ans;
    }

    static void helper(Node node, int n){
        if(node == null){
            return;
        }

        if(node.key <= n){
            ans = node.key;
        }

        if(node.key > n){
            helper(node.left, n);
        }else {
            helper(node.right, n);
        }
    }

}