

//   https://www.geeksforgeeks.org/problems/selection-sort/1

//   https://www.naukri.com/code360/problems/selection-sort_624469


class Solution {
    int select(int arr[], int i) {
        int temp = i;

        for (int j = i + 1; j < arr.length; j++) {
            if (arr[temp] > arr[j]) {
                temp = j;
            }
        }

        return temp;
    }

    void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = select(arr, i);

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}