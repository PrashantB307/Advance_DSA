

//   https://www.geeksforgeeks.org/problems/add-all-greater-values-to-every-node-in-a-bst/1

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
class Solution{
    int sum = 0;
    public Node modify(Node root)
    {
        if(root != null){
            modify(root.right);
            sum += root.data;
            root.data = sum;
            modify(root.left);
        }  

        return root;
    }
}