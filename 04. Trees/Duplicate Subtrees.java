

//   https://www.geeksforgeeks.org/problems/duplicate-subtrees/1


import java.util.*;
class Node {
    int data;
    Node left, right;

    public Node(int data) { this.data = data; }
}
class Solution {

    Set<Node> set;
    HashMap<String, Node> map;
    public List<Node> printAllDups(Node root) {
       
        set = new HashSet<>();
        map = new HashMap<>();

        traverse(root);

        List<Node> list = new ArrayList<>();
        for(Node node : set){
            list.add(node);
        }

        return list;
    }

    public String traverse(Node node){

        if(node == null){
            return "";
        }

        String left = traverse(node.left);
        String right = traverse(node.right);

        String curr = left + " " + right + " " + node.data;

        if(map.containsKey(curr)){
            set.add(map.get(curr));
        }else{
            map.put(curr, node);
        }

        return curr;
    }
}