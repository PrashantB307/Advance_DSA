

//   https://www.geeksforgeeks.org/problems/populate-inorder-successor-for-all-nodes/1

//   https://www.naukri.com/code360/problems/populate-inorder-successor-of-all-nodes-of-a-binary-tree_1118625


import java.util.*;
class Node {
    int data;
    Node left, right,next;

    public Node(int data){
        this.data = data;
    }
}

class Solution {
    ArrayList<Node> list;
    public void populateNext(Node root) {

        list = new ArrayList<>();
        inOrder(root);

        for(int i = 0; i < list.size() - 1; i++){
            list.get(i).next = list.get(i + 1);
        }


    }

    public void inOrder(Node node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        list.add(node);
        inOrder(node.right);
    }
}