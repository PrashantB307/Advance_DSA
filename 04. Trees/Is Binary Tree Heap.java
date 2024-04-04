

//   https://www.geeksforgeeks.org/problems/is-binary-tree-heap/1


import java.util.*;
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Solution {
    boolean isHeap(Node tree) {
    
        Node root = tree;
        if (root == null) {
            return true;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while (!q.isEmpty()) {
            Node curr = q.poll();
            if (curr == null) {
                list.add(-1);
            } else {
                list.add(curr.data);
                q.add(curr.left);
                q.add(curr.right);
            }
        }

        return HeapOrder(list, root);
    }

    boolean HeapOrder(ArrayList<Integer> list, Node root) {

        for (int i = 0; i < list.size(); i++) {
            int parent = i;
            int Lchild = 2 * i + 1;
            int Rchild = 2 * i + 2;
            
            if (list.get(parent) == -1) {
                return checkBST(list, parent);
            }
            if (list.get(parent) < list.get(Lchild)) {
                return false;
            }
            if (list.get(parent) < list.get(Rchild)) {
                return false;
            }
        }
        
        return true;
    }

    boolean checkBST(ArrayList<Integer> list, int parent) {
        int i = parent;
        for (; i < list.size(); i++) {
            if (list.get(i) != -1) {
                return false;
            }
        }
        
        return true;
    }
}