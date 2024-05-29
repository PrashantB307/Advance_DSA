

//   https://www.geeksforgeeks.org/problems/connect-nodes-at-same-level--170647/1


import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node nextRight;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
        nextRight = null;
    }
}

class Solution {
    public void connect(Node root) {
       
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while (q.size() > 0) {
            int n = q.size();
            Node prev = null;
            
            for(int i = 0; i < n; i++){
                Node curr = q.remove();

                if(prev != null){
                    prev.nextRight = curr;
                }
                prev = curr;

                if(curr.left != null){
                    q.add(curr.left);
                }

                if(curr.right != null){
                    q.add(curr.right);
                }
            }

            prev.nextRight = null;
        }
    }
}