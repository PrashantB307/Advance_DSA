

//   https://leetcode.com/problems/n-ary-tree-level-order-traversal/description/

//   https://www.codingninjas.com/studio/problems/n-ary-tree-level-order-traversal_1281306


import java.util.*;
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (q.size() > 0) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();

            for(int i = 0; i < size; i++){
                Node rem = q.remove();
                list.add(rem.val);

                if(rem.children != null){
                    q.addAll(rem.children);
                }
            }

            ans.add(list);
        }

        return ans;
    }
}