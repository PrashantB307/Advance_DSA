

//   https://www.geeksforgeeks.org/problems/queue-using-two-stacks/1


import java.util.*;
class StackQueue {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    void Push(int x) {
        s1.push(x);
    }

    int Pop() {
        int data = 0;

        if (s1.size() == 1) {
            return s1.pop();
        }

        if (s1.isEmpty()) {
            return -1;
        } else {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            data = s2.pop();

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        return data;
    }
}