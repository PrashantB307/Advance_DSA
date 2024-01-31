

//    https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1 

//    https://leetcode.com/problems/intersection-of-two-linked-lists/description/

//    https://www.codingninjas.com/studio/problems/intersection-of-linked-list_630457?leftPanelTab=1



class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 
class LinkedList
{
    Node head;  // head of list
}

class Intersect
{
    
	int intersectPoint(Node head1, Node head2)
	{
        Node first = head1;
        Node second = head2;
        
        int c1 = 0;
        int c2 = 0;
        while(first != null){
            first = first.next;
            c1++;
        }
        while(second != null){
            second = second.next;
            c2++;
        }
        
        first = head1;
        second = head2;
        
        int gap = Math.abs(c1 - c2);
        
        if(c1 > c2){
            for(int i = 0; i < gap; i++){
                first = first.next;
            }
        }else{
            for(int i = 0; i < gap; i++){
                second = second.next;
            }
        }
        
        while(first != null && second != null){
            if(first == second){
                return first.data; 
            }
                
            first = first.next;
            second = second.next;
        }
         
        return -1;
	}
}


