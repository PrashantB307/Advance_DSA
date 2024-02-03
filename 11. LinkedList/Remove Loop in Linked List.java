

//    https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1

//    https://www.codingninjas.com/studio/problems/interview-shuriken-42-detect-and-remove-loop_241049


class Node
{
    int data;
    Node next;
}
class Solution{
    
    public static void removeLoop(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(slow == fast){
                break;
            }
        }

        if(slow == head){
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
        }else if(slow == fast){
            slow = head;
            while(fast.next != slow.next){
                fast = fast.next;
                slow = slow.next;
            }

            fast.next = null;
        }
    }
}