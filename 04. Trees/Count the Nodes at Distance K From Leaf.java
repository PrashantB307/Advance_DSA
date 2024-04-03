

//    https://www.geeksforgeeks.org/problems/node-at-distance/1


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
    int printKDistantfromLeaf(Node root, int k)
    {
        ArrayList<Node> list = new ArrayList<>();
        Set<Node> set = new HashSet<>();

        helper(root, k, list, set, 0);

        return set.size();
    }

    void helper(Node node, int k, ArrayList<Node> list, Set<Node> set, int lev){
        if(node == null){
            return;
        }

        if(node.left == null && node.right == null){
            if(k == 0){
                set.add(node);
            }else if(lev - k >= 0){
                set.add(list.get(lev - k));
            }
            return;
        }

        list.add(node);
        helper(node.left, k, list, set, lev + 1);
        helper(node.right, k, list, set, lev + 1);

        list.remove(list.size() - 1);

    }

}