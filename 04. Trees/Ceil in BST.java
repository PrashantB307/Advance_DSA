

//   https://www.geeksforgeeks.org/problems/implementing-ceil-in-bst/1

//   https://www.codingninjas.com/studio/problems/ceil-from-bst_920464


class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
class Tree {
    int findCeil(Node root, int key) {
      
        if(root == null){
            return -1;
        }

        Node temp = root;
        int ans = -1;

        while (temp != null) {
            if(temp.data >= key){
                ans = temp.data;
                temp = temp.left;
            }else{
                temp = temp.right;
            }
        }

        return ans;
    }
}
