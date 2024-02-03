

//   https://practice.geeksforgeeks.org/problems/find-length-of-loop/1

//   https://www.codingninjas.com/studio/problems/find-length-of-loop_8160455


class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
class Solution{

    static int countNodesinLoop(Node head)
    {
        Node fast = head;
        Node slow = head;
        int len = 1;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                Node temp = slow;
                while(temp.next != slow){
                    temp = temp.next;
                    len++;
                }
                
                return len;
            }
        }

        return 0;
    }
}

