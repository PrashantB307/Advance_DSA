

//    https://www.geeksforgeeks.org/problems/shortest-prime-path--141631/1

//    https://www.geeksforgeeks.org/problems/shortest-prime-path--141632/1


import java.util.*;
class Solution{
    int solve(int num1,int num2){
        
        int[] prime = new int[10000];
        for (int i = 2; i * i < 10000; i++) {
            if (prime[i] == 0) {
                for (int j = 2 * i; j < 10000; j += i)
                    prime[j] = 1;
            }
        }

        HashSet<Integer> st = new HashSet<>();
        for (int i = 1000; i < 10000; i++) {
            if (prime[i] == 0)
                st.add(i);
        }

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, num1});

        while (!q.isEmpty()) {
            int dist = q.peek()[0];
            int n = q.peek()[1];
            q.poll();

            if (n == num2)
                return dist;

            String num = Integer.toString(n);

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <= 9; j++) {
                    char[] charArray = num.toCharArray();
                    charArray[i] = (char) ('0' + j);
                    int nNum = Integer.parseInt(new String(charArray));

                    if (st.contains(nNum)) {
                        st.remove(nNum);

                        if (num2 == nNum)
                            return dist + 1;

                        q.add(new int[]{dist + 1, nNum});
                    }
                }
            }
        }
        
        return -1;
    }
}