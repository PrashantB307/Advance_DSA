

//   https://www.geeksforgeeks.org/problems/merge-2-sorted-linked-list-in-reverse-order/1


class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
} 
class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
        Node node = new Node(0);
        Node curr = node;

        while (node1 != null && node2 != null) {
            if(node1.data < node2.data){
                curr.next = node1;
                node1 = node1.next;
            }else{
                curr.next = node2;
                node2 = node2.next;
            }

            curr = curr.next;
        }

        if(node1 != null){
            curr.next = node1;
        }else{
            curr.next = node2;
        }

        return reverseList(node.next);
    }

    Node reverseList(Node node){
        Node prev = null;
        Node curr = node;
        
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}