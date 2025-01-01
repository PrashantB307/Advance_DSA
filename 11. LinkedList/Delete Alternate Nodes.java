class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
class Solution {
    public void deleteAlt(Node head) {
        Node curr = head;
        Node temp = null;
        int i = 1;

        while(curr != null){
            if(i % 2 == 0){
               temp.next = curr.next; 
            }
            
            temp = curr;
            i++;
            curr = curr.next;
        }
    }
}