

//   https://www.geeksforgeeks.org/problems/construct-binary-tree-from-parent-array/1

//   https://www.naukri.com/code360/problems/binary-tree-from-parent-array_873336


import java.util.*;
class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}

class Solution {
    public static Node createTree(int parent[], int N) {

        HashMap<Integer, Node> map = new HashMap<>();
        Node root = null;

        for(int i = 0; i < N; i++){
            if(parent[i] == -1){
                root = new Node(i);
                map.put(i, root);
            }else{
                Node temp = new Node(i);
                map.put(i, temp);
            }
        }

        for(int i = 0; i < N; i++){
            if(parent[i] == -1){
                continue;
            }else{
                Node temp = map.get(parent[i]);
                if(temp.left == null){
                    temp.left = map.get(i);
                }else{
                    temp.right = map.get(i);
                }
            }
        }

        return root;
    }
}