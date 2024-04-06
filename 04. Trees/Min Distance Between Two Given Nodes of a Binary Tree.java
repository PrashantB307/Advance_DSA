

//   https://www.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1


class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
class GfG {
    int findDist(Node root, int a, int b) {
        Node node = findLCA(root, a, b);

        int d1 = dist(node, a);
        int d2 = dist(node, b);

        return d1 + d2;
    }

    Node findLCA(Node node, int a, int b){
        if(node == null || node.data == a || node.data == b){
            return node;
        }

        Node n1 = findLCA(node.left, a, b);
        Node n2 = findLCA(node.right, a, b);

        if(n1 == null){
            return n2;
        }

        if(n2 == null){
            return n1;
        }

        return node;
    }

    int dist(Node node, int n){
        if(node == null){
            return -1;
        }

        if(node.data == n){
            return 0;
        }

        int ld = dist(node.left, n);
        int rd = dist(node.right, n);

        if(ld == -1 && rd == -1){
            return -1;
        }else if(ld == -1){
            return rd + 1;
        }else{
            return ld + 1;
        }
    }
}