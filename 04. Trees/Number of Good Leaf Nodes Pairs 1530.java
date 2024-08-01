

//   https://leetcode.com/problems/number-of-good-leaf-nodes-pairs/

//   https://www.naukri.com/code360/problems/number-of-good-leaf-nodes-pairs_1266115


import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int countPairs(TreeNode root, int distance) {

        Map<TreeNode, ArrayList<TreeNode>> map = new HashMap<>();
        ArrayList<TreeNode> list = new ArrayList<>();

        findLeaves(root, map, list, new ArrayList<>());

        int cnt = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                List<TreeNode> list_i = map.get(list.get(i));
                List<TreeNode> list_j = map.get(list.get(j));

                for (int k = 0; k < Math.min(list_i.size(), list_j.size()); k++) {
                    if (list_i.get(k) != list_j.get(k)) {
                        int dist = list_i.size() - k + list_j.size() - k;
                        
                        if (dist <= distance) {
                            cnt++;
                        }

                        break;
                    }
                }
            }
        }

        return cnt;
    }

    public void findLeaves(TreeNode node, Map<TreeNode, ArrayList<TreeNode>> map, ArrayList<TreeNode> list,
            ArrayList<TreeNode> temp) {

        if (node == null) {
            return;
        }

        ArrayList<TreeNode> curr = new ArrayList<>(temp);
        curr.add(node);

        if (node.left == null && node.right == null) {
            map.put(node, curr);
            list.add(node);
            return;
        }

        findLeaves(node.left, map, list, curr);
        findLeaves(node.right, map, list, curr);
    }
}