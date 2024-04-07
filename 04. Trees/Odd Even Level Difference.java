

//   https://www.geeksforgeeks.org/problems/odd-even-level-difference/1


import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

class Solution
{
	int getLevelDiff(Node root)
	{
	    if(root == null){
	        return 0;
	    }
	    
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;
        
        int oSum = 0;
        int eSum = 0;

        while (q.size() > 0) {
            int size = q.size();
           

            for(int i = 0; i < size; i++){
                Node node = q.remove();

                if(flag){
                    oSum += node.data;
                }else{
                    eSum += node.data;
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

        return oSum - eSum;
    }
}