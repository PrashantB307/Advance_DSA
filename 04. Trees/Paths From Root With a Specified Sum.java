

//   https://www.geeksforgeeks.org/problems/paths-from-root-with-a-specified-sum/1


import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class Solution
{
    static ArrayList<ArrayList<Integer>> ans;
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        ans = new ArrayList<>();
        helper(root, sum, 0, new ArrayList<>());

        return ans;
    }

    public static void helper(Node node, int tar, int sum, ArrayList<Integer> list){

        if(node == null){
            return;
        }

        list.add(node.data);
        sum += node.data;

        if(sum == tar){
            ans.add(new ArrayList<>(list));
        }

        helper(node.left, tar, sum, list);
        helper(node.right, tar, sum, list);

        list.remove(list.size() - 1);
    }
}