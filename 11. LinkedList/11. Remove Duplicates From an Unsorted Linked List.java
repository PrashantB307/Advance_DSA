

//    https://www.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1

//    https://www.codingninjas.com/studio/problems/remove-duplicates-from-unsorted-linked-list_1069331


import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}

class Solution{
    
    public Node removeDuplicates(Node head){
        
        HashMap<Integer, Integer> map = new HashMap<>();
        Node curr = head;
        Node prev = curr;
        
        map.put(curr.data, 1);
        curr = curr.next;

        while (curr != null) {
            if(map.containsKey(curr.data)){
                prev.next = curr.next;
            }else{
                map.put(curr.data, 1);
                prev = curr;
            }

            curr = prev.next;
        }

        return head;
    }
}