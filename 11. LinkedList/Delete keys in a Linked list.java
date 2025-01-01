

//   https://www.geeksforgeeks.org/problems/delete-keys-in-a-linked-list/1


class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG {
    public static Node deleteAllOccurances(Node head, int x) {
        Node temp = new Node(-1);
        temp.next = head;

        Node curr = temp;

        while (temp != null && temp.next != null) {
            if (temp.next.data == x) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return curr.next;
    }
}