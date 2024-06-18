

//   https://www.geeksforgeeks.org/problems/index-of-an-extra-element/1


class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        int start = 0;
        int end = n - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr1[mid] == arr2[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}