

//   https://www.geeksforgeeks.org/problems/minimum-incrementdecrement-to-make-array-non-increasing--170637/1


import java.util.*;
class Solution {
    public static int minOperations(int a[], int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if(!pq.isEmpty() && pq.peek() < a[i]){
                int diff = a[i] - pq.remove();
                pq.add(a[i]);
                sum += diff;
            }

            pq.add(a[i]);
        }

        return sum;
    }
}
