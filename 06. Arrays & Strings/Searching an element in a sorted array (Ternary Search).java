

//   https://www.geeksforgeeks.org/problems/searching-an-element-in-a-sorted-array-ternary-search--141631/1


class Solution {
    static int ternarySearch(int arr[], int N, int tar) {
        int st = 0;
        int end = N - 1;

        while (st <= end) {
            int mid1 = st + (end - st) / 3;
            int mid2 = end - (end - st) / 3;

            if (arr[mid1] == tar) {
                return 1;
            } else if (arr[mid2] == tar) {
                return 1;
            } else if (arr[mid1] > tar) {
                end = mid1 - 1;
            } else if (arr[mid2] < tar) {
                st = mid2 + 1;
            } else {
                st = mid1 + 1;
                end = mid2 - 1;
            }
        }

        return -1;
    }
}