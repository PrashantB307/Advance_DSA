

//    https://www.geeksforgeeks.org/problems/serialize-and-deserialize-a-binary-tree/1


import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

class Tree {
    ArrayList<Integer> list;
    public ArrayList<Integer> serialize(Node root) {
       
        list = new ArrayList<>();
        preOrder(root);

        return list;
    }

    public void preOrder(Node node){
        if(node == null){
            list.add(-1);
            return;
        }

        list.add(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    int idx;
    public Node deSerialize(ArrayList<Integer> A) {
       
        idx = 0;

        return dfs(A);
    }

    public Node dfs(ArrayList<Integer> list){

        if(idx == list.size()){
            return null;
        }

        int val = list.get(idx);
        idx++;

        if(val == -1){
            return null;
        }

        Node node = new Node(val);
        node.left = dfs(list);
        node.right = dfs(list);

        return node;
    }
};