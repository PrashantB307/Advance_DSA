

//    https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1

//    https://leetcode.com/problems/swap-nodes-in-pairs/description/

//    https://www.codingninjas.com/studio/problems/pair-swap_759396


class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Solution {
    
    public Node pairwiseSwap(Node head)
    {
        if(head == null || head.next == null){
            return head;
        }

        Node curr = head.next.next;
        Node prev = head;
        head = head.next;
        head.next = prev;

        while(curr != null && curr.next != null){
            prev.next = curr.next;
            prev = curr;
            Node temp = curr.next.next;
            curr.next.next = curr;
            curr = temp;
        }

        prev.next = curr;

        return head;
    }
}