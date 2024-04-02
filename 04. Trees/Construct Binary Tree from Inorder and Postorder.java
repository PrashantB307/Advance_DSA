

//   https://www.geeksforgeeks.org/problems/tree-from-postorder-and-inorder/1

//   https://www.codingninjas.com/studio/problems/construct-binary-tree-from-inorder-and-postorder-traversal_1266106


import java.util.*;
class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class GfG {

    HashMap<Integer, Integer> map;
    int postIdx;

    Node buildTree(int in[], int post[], int n) {
        
        map = new HashMap<>();

        postIdx = n - 1;
        for(int i = 0; i < n; i++){
            map.put(in[i],i);
        }
        
        return newtree(in, post, 0, n-1);
    }
    
    public Node newtree(int in[], int post[], int start, int end){
        
        if(start > end){
            return null;
        }
        
        Node root = new Node(post[postIdx--]);
        
        int inIdx = map.get(root.data);
        
        root.right = newtree(in, post, inIdx + 1, end);
        root.left = newtree(in, post, start, inIdx - 1);
    
        return root;
    }
}