

//   https://www.geeksforgeeks.org/problems/mila-and-strings0435/1


import java.util.*;
class Solution {
    static String lexicographicallySmallest(String S, int k) {

        Stack<Character> st = new Stack<Character>();
        StringBuilder ans = new StringBuilder();

        int n = S.length();

        k = n != 0 && (n & (n - 1)) == 0 ? k / 2 : k * 2;

        if (k >= n)
            return "-1";

        for (int i = 0; i < n; i++) {
            while (k > 0 && !st.isEmpty() && st.peek() > S.charAt(i)) {
                st.pop();
                k--;
            }

            st.push(S.charAt(i));
        }

        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}
