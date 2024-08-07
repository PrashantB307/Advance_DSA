

//   https://www.geeksforgeeks.org/problems/remove-half-nodes/1


//   https://www.naukri.com/code360/problems/remove-half-nodes_920754


class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}


class Solution {
    public Node RemoveHalfNodes(Node root) {

        return helper(root);
    }

    public Node helper(Node node){
        if(node == null){
            return null;
        }

        node.left = helper(node.left);
        node.right = helper(node.right);

        if(node.left == null && node.right == null){
            return node;
        }else if(node.left == null){
            node = node.right;
            return node;
        }else if(node.right == null){
            node = node.left;
            return node;
        }

        return node;
    } 
}