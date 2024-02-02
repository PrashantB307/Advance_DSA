

//    https://www.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/0

//    https://www.codingninjas.com/studio/problems/add-one-to-linked-list_920557


class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
class Solution
{
    public static Node addOne(Node node) 
    { 
        Node l1 = reverse(node);

        Node head = null;
        Node tail = null;
       
        int carry = 1;
      
        while(l1  != null || carry == 1){


            int res = carry;

            if(l1 != null){
                res += l1.data;
                l1 = l1.next;
            }

            int data = res % 10;
            carry = res / 10;

            if(head == null){
                head = tail = new Node(data);
            }else{
                tail.next = new Node(data);
                tail = tail.next;
            }
        }

        return reverse(head);
    }
    
    static Node reverse(Node head)
    {
        Node prev=null;
        Node curr=head;
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}