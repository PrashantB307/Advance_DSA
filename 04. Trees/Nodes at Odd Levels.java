
 
//   https://www.geeksforgeeks.org/problems/nodes-at-odd-levels/1


import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
class Solution{
    public ArrayList<Node> nodesAtOddLevels(Node root)
    {
        ArrayList<Node> list = new ArrayList<>();

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;

        while (q.size() > 0) {
            int size = q.size();
           

            for(int i = 0; i < size; i++){
                Node node = q.remove();

                if(flag){
                    list.add(node);
                }

                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }

            }

            flag = !flag;
        }

        return list;
    }
}