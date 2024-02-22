

//   https://leetcode.com/problems/find-k-closest-elements/description/

//   https://www.geeksforgeeks.org/problems/k-closest-elements3619/1

import java.util.*;
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> list = new ArrayList<>();
        int s = 0;
        int e = arr.length - 1;

        while (e - s >= k) {
            if (Math.abs(arr[s] - x) > Math.abs(arr[e] - x)) {
                s++;
            } else {
                e--;
            }
        }

        for (int i = s; i <= e; i++) {
            list.add(arr[i]);
        }

        return list;
    }
}

// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX====>   GFG    <====XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

class Solution2 {
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