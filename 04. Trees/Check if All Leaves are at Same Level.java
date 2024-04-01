

//    https://www.geeksforgeeks.org/problems/leaf-at-same-level/1


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
    boolean check(Node root) {

        if(root == null){
            return true;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        boolean flag = true;
        int lev = 0;
        int leafLev = 0;

        while (q.size() > 0) {
            int size = q.size();

            for(int i = 0; i < size; i++){
                Node curr = q.remove();

                if(curr.left == null && curr.right == null){
                    if(flag){
                        leafLev = lev;
                        flag = false;
                    }
                    else if(lev != leafLev){
                        return false;
                    }
                }

                if(curr.left != null){
                    q.add(curr.left);
                }

                if(curr.right != null){
                    q.add(curr.right);
                }
            }

            lev++;
        }

        return true; 
    }
}
