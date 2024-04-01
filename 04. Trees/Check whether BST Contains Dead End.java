

//    https://www.geeksforgeeks.org/problems/check-whether-bst-contains-dead-end/1

//    https://www.codingninjas.com/studio/problems/check-for-dead-end-in-a-bst_1169457


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
    public static boolean isDeadEnd(Node root) {
        if (root == null) {
            return true;
        }

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> leafSet = new HashSet<>();
        set.add(0);

        containsNode(root, set, leafSet);

        for (int val : leafSet) {
            int x = val;

            if(set.contains(x + 1) && set.contains(x - 1)){
                return true;
            }
        }

        return false;
    }

    static void containsNode(Node node,  HashSet<Integer> set,  HashSet<Integer> leafSet){
        if(node == null){
            return;
        }

        set.add(node.data);
        if(node.left == null && node.right == null){
            leafSet.add(node.data);
            return;
        }

        containsNode(node.left, set, leafSet);
        containsNode(node.right, set, leafSet);
    }
}