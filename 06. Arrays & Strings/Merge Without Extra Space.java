

//   https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1

//   https://www.codingninjas.com/studio/problems/merge-two-sorted-arrays-without-extra-space_6898839


import java.util.*;
class Solution {
    public static void merge(long arr1[], long arr2[], int n, int m) {
        int i = n - 1;
        int j = 0;

        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                swap(arr1, arr2, i, j);
            }

            i--;
            j++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    static void swap(long arr1[], long arr2[], int n, int m) {
        long temp = arr1[n];
        arr1[n] = arr2[m];
        arr2[m] = temp;
    }
}
