

//   https://www.geeksforgeeks.org/problems/vertical-width-of-a-binary-tree/1


class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}

class Solution {

    int min;
    int max;
    public int verticalWidth(Node root) {
        
        if(root == null){
            return 0;
        }

        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        traverse(root, 0);

        return (max - min) + 1;
    }

    public void traverse(Node node, int dis){
        if(node == null){
            return;
        }

        max = Math.max(max, dis);
        min = Math.min(min, dis);

        traverse(node.left, dis - 1);
        traverse(node.right, dis + 1);
    }
}