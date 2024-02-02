

//   https://practice.geeksforgeeks.org/problems/count-pairs-whose-sum-is-equal-to-x/1


import java.util.*;
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {
        HashSet<Integer> set = new HashSet<>();

        for (int val : head2) {
            set.add(val);
        }

        int c = 0;
        for (int val : head1) {
            if (set.contains(x - val)) {
                c++;
            }
        }

        return c;

    }

}