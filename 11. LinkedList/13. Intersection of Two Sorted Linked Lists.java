

//   https://practice.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1

//   https://www.codingninjas.com/studio/problems/intersection-of-linked-lists_3210610


class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

class Solution
{
   public static Node findIntersection(Node h1, Node h2)
    {
        if(h1 == null){
            return h2;
        }

        if(h2 == null){
            return h1;
        }

        Node curr = null;
        Node prev = curr;

        while (h1 != null && h2 != null) {
            if(h1.data  == h2.data){
                Node newNode = new Node(h1.data);

                if(curr == null){
                    curr = newNode;
                }else{
                    prev.next = newNode;
                }

                prev = newNode;
                h1 = h1.next;
                h2 = h2.next;
            }else if(h1.data < h2.data){
                h1 = h1.next;
            }else{
                h2 = h2.next;
            }
        }

        return curr;
    }
}