

//   https://practice.geeksforgeeks.org/problems/sort-a-linked-list/1

//   https://leetcode.com/problems/sort-list/description/

//   https://www.codingninjas.com/studio/problems/merge-sort-linked-list_920473


class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
}

class Solution{
    static Node mergeSort(Node head){
        
        if (head == null || head.next == null){
            return head;
        }

        Node mid = midNode(head);
        Node newNode = mid.next;
        mid.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(newNode);

        Node ans = Merge(left, right);

        return ans;

    }

    static Node midNode(Node head){
        Node f = head;
        Node s = head;

        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }

        return s;
    }

    static Node Merge(Node l1, Node l2){

        Node node = new Node(-1);
        Node temp = node;
        Node left = l1;
        Node right = l2;
        
        while (left != null && right != null) {
            
            if(left.data <= right.data){
                temp.next = left;
                left = left.next;
            }else{
                temp.next = right;
                right = right.next;
            }

            temp = temp.next;
        }

        if(left != null){
            temp.next = left;
        }

        if(right != null){
            temp.next = right;
        }

        return node.next;
    } 
}
