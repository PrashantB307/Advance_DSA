

//    https://www.geeksforgeeks.org/problems/max-level-sum-in-binary-tree/1


import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

class Solution {
    public int maxLevelSum(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int max = Integer.MIN_VALUE;
        while (q.size() > 0) {
            int n = q.size();
            int sum = 0;

            for(int i = 0; i < n; i++){
                Node curr = q.remove();
                sum += curr.data; 

                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }

            if(sum > max){
                max = sum;
            }
        }

        return max;
    }
}