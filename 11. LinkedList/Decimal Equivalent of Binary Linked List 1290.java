

//    https://www.geeksforgeeks.org/problems/decimal-equivalent-of-binary-linked-list/1

//    https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/


import java.util.*;
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    long mod = 1000000007;

    long DecimalValue(Node head) {
       ArrayList<Integer> list = new ArrayList<>();
        Node node = head;
        while (node != null) {
            list.add(node.data);
            node = node.next;
        }

        Collections.reverse(list);
        long base = 1;
        long result = 0;
        int i = 0;

        while (i < list.size()) {
            long temp = list.get(i);
            result += ( (base % mod) * temp) % mod;
            base = ( (base % mod) * 2) % mod;
            i++;
        }
        
        return result % mod;    
    }
}