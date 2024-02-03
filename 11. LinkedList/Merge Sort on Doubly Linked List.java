

//    https://practice.geeksforgeeks.org/problems/merge-sort-on-doubly-linked-list/1


class Node{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}

class LinkedList{
   
    static Node sortDoubly(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node mid = middle(head);

        Node left = head;
        Node right = mid.next;
        mid.next = null;
        mid.prev = null;

        left = sortDoubly(left);
        right = sortDoubly(right);

        Node res = merging(left, right);

        return res;
    }

    static Node middle(Node head){
        Node s = head;
        Node f = head.next;

        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }

        return s;
    }

    static Node merging(Node left, Node right){

        if(left == null){
            return right;
        }

        if(right == null){
            return left;
        }

        Node ans = new Node(-1);
        Node temp = ans;

        while (left != null && right != null) {
            if(left.data < right.data){
                temp.next = left;
                left.prev = temp;
                temp = left;
                left = left.next;
            }else{
                temp.next = right;
                right.prev = temp;
                temp = right;
                right = right.next;
            }
        }

        while(left != null){
            temp.next = left;
            left.prev = temp;
            temp = left;
            left = left.next;
        }

        while (right != null) {
            temp.next = right;
            right.prev = temp;
            temp = right;
            right = right.next;
        }

        ans = ans.next;
        ans.prev = null;

        return ans;
    }

}
