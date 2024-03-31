

//   https://www.geeksforgeeks.org/problems/ancestors-in-binary-tree/1

//   https://www.codingninjas.com/studio/problems/ancestors_920386


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

    public static ArrayList<Integer> Ancestors(Node root, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(root, target, list);

        return list;
    }

    public static boolean helper(Node node, int tar, ArrayList<Integer> list) {
        if (node == null) {
            return false;
        }

        if (node.data == tar) {
            return true;
        }

        if(helper(node.left, tar, list) || helper(node.right, tar, list)){
            list.add(node.data);

            return true;
        }

        return false;
    }
}