

//    https://www.geeksforgeeks.org/problems/introduction-to-linked-list/1


class Node {
    int data;
    Node next;
    Node() {
        data = 0;
    }
    Node(int d) {
        data = d;
    }
}

class Solution {
    static Node constructLL(int arr[]) {
        if(arr.length == 0){
            return null;
        }
        
        Node head = new Node(arr[0]);
        Node curr = head;
        
        for(int i = 1; i < arr.length; i++){
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }

        return head;
    }
}