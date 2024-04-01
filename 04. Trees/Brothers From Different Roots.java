

//    https://www.geeksforgeeks.org/problems/brothers-from-different-root/1


import java.util.*;
class Node{
	int data;
	Node left, right;

	Node(int val) {
		data = val;
		left = right = null;
	}
}

class Solution
{
	public static int countPairs(Node root1, Node root2, int x){
		ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        inOrder(root1, list1);
        inOrder(root2, list2);

        int l = 0;
        int r = list2.size() - 1;
        int cnt = 0;

        while (l < list1.size() && r >= 0) {
            int sum = list1.get(l) + list2.get(r);

            if(sum == x){
                cnt++;
                l++;
                r--;
            }else if(sum < x){
                l++;
            }else{
                r--;
            }
        }

        return cnt;
	}

    public static void inOrder(Node node, ArrayList<Integer> list){
        if(node == null){
            return;
        }

        inOrder(node.left, list);
        list.add(node.data);
        inOrder(node.right, list);
    }
}