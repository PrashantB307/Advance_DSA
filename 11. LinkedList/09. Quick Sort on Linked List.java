

//   https://practice.geeksforgeeks.org/problems/quick-sort-on-linked-list/1

//   https://www.codingninjas.com/studio/problems/quick-sort-on-linked-list_893099


class Node{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
    
}
class GfG{

    public static Node quickSort(Node head){
    
        Node node = head;
        if(node == null || node.next == null){
            return head;
        }

        Node tail = getTail(node);
        solveSort(node, tail);

        return head;
    }

    static Node getTail(Node node){
        Node temp = node;

        while (temp != null && temp.next != null) {
            temp = temp.next;
        }

        return temp;
    } 

    static void solveSort(Node head, Node tail){
        if(head == null || tail == null || head == tail){
            return;
        }

        Node pivot = partition(head, tail);
        solveSort(head, pivot);
        solveSort(pivot.next, tail);
    }

    static Node partition(Node head, Node tail){

        Node pivot = head;
        Node curr = head.next;
        Node prev = head;

        while(curr != tail.next){
            if(pivot.data > curr.data){
                int temp = prev.next.data;
                prev.next.data = curr.data;
                curr.data = temp;

                prev = prev.next;
            }

            curr = curr.next;
        }

        int temp = prev.data;
        prev.data = pivot.data;
        pivot.data = temp;

        return prev;
    }
}