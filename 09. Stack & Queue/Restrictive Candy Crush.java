
//   https://www.geeksforgeeks.org/problems/restrictive-candy-crush--141631/1


import java.util.*;
class Solution {
    public static String reduced_String(int k, String s) {
        
        Stack<Character> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (!st1.isEmpty() && st1.peek() == ch) {
                st1.push(ch);
                st2.push(st2.peek() + 1);
            } else {
                st1.push(ch);
                st2.push(1);
            }

            if (st2.peek() == k) {
                int a = k;
                
                while (a-- > 0) {
                    st1.pop();
                    st2.pop();
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char ch : st1) {
            ans.append(ch);
        }
        
        return ans.toString();
    }
}