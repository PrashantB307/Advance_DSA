

//   https://www.geeksforgeeks.org/problems/nearly-sorted-1587115620/1


import java.util.*;
class Solution {
    public void nearlySorted(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0, j = 0;

        while(j < arr.length){
            pq.add(arr[j]);
            j++;

            if(pq.size() > k){
                arr[i] = pq.poll();
                i++;
            }
        }

        while (pq.size() > 0) {
            arr[i] = pq.poll();
            i++;
        }

    }
}