

//   https://www.geeksforgeeks.org/problems/unsorted-array4925/1


import java.util.*;
class Solution {
    public int findElement(List<Integer> arr) {
        int n = arr.size();

        int[] maxArr = new int[n];
        int[] minArr = new int[n];

        maxArr[0] = arr.get(0);
        for(int i = 1; i < n; i++){
            maxArr[i] = Math.max(maxArr[i - 1], arr.get(i));
        }

        minArr[n - 1] = arr.get(n - 1);
        for(int i = n - 2; i >= 0; i--){
            minArr[i] = Math.min(minArr[i + 1], arr.get(i));
        }

        for(int i = 1; i > n - 2; i++){
            if(maxArr[i - 1] < arr.get(i) && minArr[i + 1] > arr.get(i)){
                return arr.get(i);
            }
        }

        return -1;

    }
}