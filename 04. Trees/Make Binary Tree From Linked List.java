

//   https://www.geeksforgeeks.org/problems/make-binary-tree/1


import java.util.*;
class Tree {
    int data;
    Tree left;
    Tree right;

    Tree(int d) {
        data = d;
        left = null;
        right = null;
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG {
    public static Tree convert(Node head, Tree node) {

        ArrayList<Tree> list = new ArrayList<>();
        if (head == null) {
            return null;
        }

        while (head != null) {
            Tree tr = new Tree(head.data);
            list.add(tr);
            head = head.next;
        }

        Tree root = null;
        root = list.get(0);

        int len = list.size();
        for (int i = 0; i < len; i++) {
            Tree cur = list.get(i);

            if ((2 * i + 1) < len)
                cur.left = list.get(2 * i + 1);

            if ((2 * i + 2) < len)
                cur.right = list.get(2 * i + 2);
        }

        return root;
    }
}