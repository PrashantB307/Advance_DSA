

//   https://www.geeksforgeeks.org/problems/connect-nodes-at-same-level/1

//   https://www.codingninjas.com/studio/problems/connect-nodes-at-same-level_985347


import java.util.*;
class Node {
    int data;
    Node left;
    Node right;
    Node nextRight;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
        nextRight = null;
    }
}

class Solution {
    public void connect(Node root) {

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (q.size() > 0) {
            int n = q.size();
            ArrayList<Node> list = new ArrayList<>();

            for(int i = 0; i < n; i++){
                Node rem = q.remove();
                list.add(rem);

                if(rem.left != null){
                    q.add(rem.left);
                }

                if(rem.right != null){
                    q.add(rem.right);
                }
            }

            list.add(null);

            for(int i = 0; i < n; i++){
                list.get(i).nextRight = list.get(i + 1);
            }
        }
    }
}