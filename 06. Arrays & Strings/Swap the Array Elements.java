

//   https://www.geeksforgeeks.org/problems/need-some-change/1


class Solution {
    public void swapElements(int[] arr, int n) {

        for (int i = 0; i < n - 2; i++) {
            swap(i, i + 2, arr);
        }
    }

    public void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}