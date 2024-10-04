

//   https://www.geeksforgeeks.org/problems/remove-every-kth-node/1


class Node {
    Node next;
    int data;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    Node delete(Node head, int k) {

        int i = 1;
        Node temp = head;
        
        if(i == k){
            return null;
        }

        while(temp != null && temp.next != null){
            if(i + 1 == k){
                temp.next = temp.next.next;
                i = 0;
            }
            
            i++;
            temp = temp.next;
        }

        return head;
    }
}