

//   https://www.geeksforgeeks.org/problems/array-to-bst4443/1


class Node {
    int data;
    Node left, right;

    public Node(int data) { this.data = data; }
}
class Solution {
    public Node sortedArrayToBST(int[] nums) {
        
        Node node = helper(nums, 0, nums.length - 1); 

        return node;
    }

    public Node helper(int[] arr, int l, int r){
        if(l > r){
            return null; 
        }

        int mid = l + (r - l) / 2;

        Node node = new Node(arr[mid]);
        node.left = helper(arr, l, mid - 1);
        node.right = helper(arr, mid + 1, r);

        return node;
    }
}