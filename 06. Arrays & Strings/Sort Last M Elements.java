

//   https://www.geeksforgeeks.org/problems/sort-last-m-elements--155156/1


import java.util.*;
class Solution {
    public void sortLastMelements(int[] nums, int n, int m) {
        
        int[] arr = new int[m];
        for (int i = n; i < nums.length; i++) {
            arr[i - n] = nums[i];
        }

        Arrays.sort(arr);
        int k = 0;
        for (int i = n; i < nums.length; i++) {
            nums[i] = arr[k++];
        }

    }
}