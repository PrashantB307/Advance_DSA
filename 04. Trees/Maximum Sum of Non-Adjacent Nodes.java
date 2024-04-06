

//   https://www.geeksforgeeks.org/problems/maximum-sum-of-non-adjacent-nodes/1

//   https://www.codingninjas.com/studio/problems/maximum-sum-of-nodes-in-a-binary-tree-such-that-no-two-nodes-are-adjacent_1118112


import java.util.*;
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
class Solution
{
    static HashMap<Node , Integer> map = new HashMap<>();
    static int getMaxSum(Node root)
    {
        
        if(root == null){
            return 0;
        }

        if(map.containsKey(root)){
            return map.get(root);
        }

        int val = root.data;

        if(root.left != null){
            val += getMaxSum(root.left.left);
            val += getMaxSum(root.left.right);
        }

        if(root.right != null){
            val += getMaxSum(root.right.left);
            val += getMaxSum(root.right.right);
        }

        int val2 = getMaxSum(root.left) + getMaxSum(root.right);
        map.put(root, Math.max(val, val2));

        return map.get(root);
    }
}