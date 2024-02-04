

//   https://practice.geeksforgeeks.org/problems/given-a-linked-list-reverse-alternate-nodes-and-append-at-the-end/1



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

class Solution
{
    public static void rearrange(Node odd)
    {
        Node even = odd.next;
        Node evenHead = even;
        
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        
        Node evenReverse = reverse(evenHead);
        odd.next = evenReverse;
    }
    
    public static Node reverse(Node node){
        Node prev = null;
        Node curr = node;
        
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
     } 
}