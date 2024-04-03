

//   https://www.geeksforgeeks.org/problems/diagonal-sum-in-binary-tree/1

//   https://www.codingninjas.com/studio/problems/diagonal-sum_790722


import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

class Tree {
    public static ArrayList <Integer> diagonalSum(Node root) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (q.size() > 0) {
            int n = q.size();
            int sum = 0;

            for(int i = 0; i < n; i++){
                Node rem = q.remove();

                while (rem != null) {
                    sum += rem.data;
                    
                    if(rem.left != null){
                        q.add(rem.left);
                    }

                    rem = rem.right;
                }
            }

            list.add(sum);
        }

        return list;
    }
}