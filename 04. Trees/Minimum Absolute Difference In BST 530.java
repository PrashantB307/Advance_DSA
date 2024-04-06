

//   https://www.geeksforgeeks.org/problems/minimum-absolute-difference-in-bst-1665139652/1


class Node
{
    int data;
    Node left, right;
    Node(int item)    {
        data = item;
        left = right = null;
    }
}

class Solution
{
    int min = Integer.MAX_VALUE;
    Node temp = null;
    int absolute_diff(Node root)
    {    
        helper(root);

        return min;
    }

    public void helper(Node node){
        if(node == null){
            return;
        }

        helper(node.left);

        if(temp != null){
            min = Math.min(min, node.data - temp.data);
        }

        temp = node;
        helper(node.right);
    }
}