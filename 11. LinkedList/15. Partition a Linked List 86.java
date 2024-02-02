

//     https://leetcode.com/problems/partition-list/description/

//     https://practice.geeksforgeeks.org/problems/partition-a-linked-list-around-a-given-value/1


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode partition(ListNode head, int x) {
        
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode l1curr = l1;
        ListNode l2curr = l2;

        while(head != null){
            if(head.val < x){
                l1curr.next = head;
                l1curr = l1curr.next;
            }else if(head.val > x){
                l2curr.next = head;
                l2curr = l2curr.next;
            }

            head = head.next;
        }

        l2curr.next = null;
        l1curr.next = l2.next;
    
        return l1.next;
    }
}


//XXXXXXXXXXXXXXXXXXXXXXXXXX======>    GFG     <======XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


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

class Solution2 {
    public static Node partition(Node node, int x) {
        
        Node first = new Node(0);
        Node second = new Node(0);
        Node third = new Node(0);
        
        
        Node fcurr = first;
        Node scurr = second;
        Node thcurr = third;
        
        while(node != null){
            if(node.data < x){
                fcurr.next = node;
                fcurr = fcurr.next;
            }else if(node.data > x){
                scurr.next = node;
                scurr = scurr.next;
            }else{
                thcurr.next = node;
                thcurr = thcurr.next;
            }
            
            node = node.next;
        }
        
        scurr.next = null;
        thcurr.next = second.next;
        fcurr.next = third.next;
        
        return first.next; 
    }
}