

//  https://www.geeksforgeeks.org/problems/leaves-to-dll/1


import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class Tree{

    LinkedList<Node> list;
    public Node convertToDLL(Node root){
        
        list = new LinkedList<>();

        traverse(root);

        Node temp = new Node(-1);
        Node prev = temp;

        while(list.size() > 0){
            Node curr = list.removeFirst();

            curr.left = prev;
            prev.right = curr;

            prev = curr;
        }

        temp.right.left = null;

        return temp.right;
    }

    public Node traverse(Node node){
        if(node == null){
            return null;
        }

        if(node.left == null && node.right == null){
            list.add(node);
            return null;
        }

        node.left = traverse(node.left);
        node.right = traverse(node.right);
        
        return node;
    }
}
