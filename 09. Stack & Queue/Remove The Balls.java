

//    https://practice.geeksforgeeks.org/problems/remove-the-balls--170647/1


import java.util.*;
class Solution {
    public static int finLength(int N, int[] color, int[] radius) {

        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        int i = 0;
        while (i < color.length) {
            if (st1.peek() == color[i] && st2.peek() == radius[i]) {
                st1.pop();
                st2.pop();
            }else{
                st1.push(color[i]);
                st2.push(radius[i]);
            }

            
            i++;
        }

        return st1.size();
    }
}
