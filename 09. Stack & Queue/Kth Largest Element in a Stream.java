

//   https://www.geeksforgeeks.org/problems/kth-largest-element-in-a-stream2220/1


import java.util.*;
class Solution {
    static int[] kthLargest(int k, int[] arr, int n) {

        Queue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < n; i++){
            pq.add(arr[i]);

            while (pq.size() > 0) {
                pq.remove();
            }

            if(pq.size() >= k){
                arr[i] = pq.peek();
            }else{
                arr[i] = -1;
            }
        }

        return arr;
    }
}