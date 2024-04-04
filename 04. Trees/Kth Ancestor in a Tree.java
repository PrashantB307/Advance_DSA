

//   https://www.geeksforgeeks.org/problems/kth-ancestor-in-a-tree/1?page=1&difficulty=Medium,Hard&status=unsolved&sortBy=submissions

//   https://www.codingninjas.com/studio/problems/kth-ancestor-of-a-node-in-binary-tree_842561


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
    public int kthAncestor(Node root, int k, int node)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        dfs(root, map);

        int ans = -1;
        while (k-- > 0) {
            ans = map.getOrDefault(node, -1);
            node = ans;
        }

        return ans;
    }

    public void dfs(Node node, HashMap<Integer, Integer> map){
        if(node == null){
            return;
        }

        if(node.left != null){
            map.put(node.left.data, node.data);
        }

        if(node.right != null){
            map.put(node.right.data, node.data);
        }

        dfs(node.left, map);
        dfs(node.right, map);
    }
}