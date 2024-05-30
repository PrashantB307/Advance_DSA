

//   https://www.geeksforgeeks.org/problems/pairs-violating-bst-property--212515/1


class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

    static int k;
    public static int pairsViolatingBST(int n, Node root) {
        k = 0;
        int cnt = 0;
        int[] arr = new int[n];
        inOrder(root, arr);

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] > arr[j]){
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static void inOrder(Node node, int[] arr){
        if(node == null){
            return;
        }

        inOrder(node.left, arr);
        arr[k++] = node.data;
        inOrder(node.right, arr);
    }
}
