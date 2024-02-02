

//   https://www.geeksforgeeks.org/problems/length-of-longest-palindrome-in-linked-list/1


class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG {
    public static int maxPalindrome(Node head) {
        Node curr = head;
        Node prev = null;
        int ans = 0;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;

            ans = Math.max(ans, 2 * count(prev, next) + 1);   // Odd Size
            ans = Math.max(ans, 2 * count(curr, next));   // Even Size

            prev = curr;
            curr = next;
        }

        return ans;
    }

    static int count(Node fNode, Node sNode){
        int cnt = 0;
        Node a = fNode;
        Node b = sNode;

        while (a != null && b != null) {
            if(a.data == b.data){
                a = a.next;
                b = b.next;
                cnt++;
            }else{
                break;
            }
        }

        return cnt;
    }
}