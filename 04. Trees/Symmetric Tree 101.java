

//    https://www.geeksforgeeks.org/problems/symmetric-tree/1

//    https://leetcode.com/problems/symmetric-tree/description/


class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
class GfG
{
    public static boolean isSymmetric(Node root)
    {
        return helper(root, root);
    }
    
    public static boolean helper(Node n1, Node n2){
        if(n1 == null && n2 == null){
            return true;
        }
        
        if(n1 == null || n2 == null){
            return false;
        }
        
        if(n1.data != n2.data){
            return false;
        }else{
             return helper(n1.left, n2.right) && helper(n1.right, n2.left);
        }
    
    }
}