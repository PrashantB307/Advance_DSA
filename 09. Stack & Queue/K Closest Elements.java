

//   https://www.geeksforgeeks.org/problems/k-closest-elements3619/1


import java.util.*;
class Solution {
    int[] printKClosest(int[] arr, int n, int k, int x) {
        int[] ans = new int[k];

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(
                (a, b) -> b.key == a.key ? (a.value - b.value) : (b.key - a.key));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                continue;
            maxHeap.add(new Pair(Math.abs(arr[i] - x), arr[i]));
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int i = k - 1;
        while (maxHeap.size() > 0) {
            ans[i--] = maxHeap.poll().value;
        }
        return ans;
    }

}

class Pair {
    int key;
    int value;

    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }
}