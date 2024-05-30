

//   https://www.geeksforgeeks.org/problems/kth-common-ancestor-in-bst/1


import java.util.*;
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    public int kthCommonAncestor(Node root, int k, int x, int y) {
        List<Integer> list = new ArrayList<>();

        helperFun(root, Math.min(x, y), Math.max(x, y), list);

        int size = list.size();
        
        if (size - k >= 0){
            return list.get(size - k);
        }
            
        return -1;
    }

    private void helperFun(Node root, int x, int y, List<Integer> list) {
        int data = root.data;
        list.add(data);

        if (data > x && data < y){
            return;
        }
            
        if (data < x && data < y){
            helperFun(root.right, x, y, list);
        }else if (data > x && data > y){
            helperFun(root.left, x, y, list);
        }
            
    }
}
