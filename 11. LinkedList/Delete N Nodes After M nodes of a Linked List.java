

//   https://www.geeksforgeeks.org/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/1

//   https://www.naukri.com/code360/problems/delete-n-nodes-after-m-nodes-of-a-linked-list_668903


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {
    static void linkdelete(Node head, int M, int N) {

        Node temp = head;
        Node temp1 = head;
        Node prev1 = null;

        while (temp != null) {
            for (int i = 0; i < M; i++) {
                prev1 = temp;
                temp = temp.next;
                if (temp == null)
                    return;
            }

            temp1 = temp;
            for (int i = 0; i < N; i++) {
                if (temp1.next == null) {
                    prev1.next = null;
                    return;
                }

                temp1 = temp1.next;
            }

            prev1.next = temp1;
            temp = temp1;
        }
    }
}