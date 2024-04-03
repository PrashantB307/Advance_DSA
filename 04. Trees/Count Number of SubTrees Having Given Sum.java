

//   https://www.geeksforgeeks.org/problems/count-number-of-subtrees-having-given-sum/1


class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}

class Tree
{
    int cnt;
    int countSubtreesWithSumX(Node root, int X)
    {
        cnt = 0;
        helperCount(root, X);

        return cnt;
    }

    int helperCount(Node node, int n){
        if(node == null){
            return 0;
        }

        int left = helperCount(node.left, n);
        int right = helperCount(node.right, n);
        int sum = left + right + node.data;

        if(sum == n){
            cnt++;
        }

        return sum;
    }
}

