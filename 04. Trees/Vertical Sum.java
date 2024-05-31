

//    https://www.geeksforgeeks.org/problems/vertical-sum/1


import java.util.*;
class Node {
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class Solution {

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    public ArrayList<Integer> verticalSum(Node root) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        helper(root, map, 0);

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = min; i <= max; i++){
            if(map.get(i) != null){
                list.add(map.get(i));
            }
        }

        return list;
        
    }

    public void helper(Node node, HashMap<Integer, Integer> map, int level){
        if(node == null){
            return;
        }

        min = Math.min(min, level);
        max = Math.max(max, level);

        map.put(level, map.getOrDefault(level, 0) + node.data);

        helper(node.left, map, level - 1);
        helper(node.right, map, level + 1);
    }
}
