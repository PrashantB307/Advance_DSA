

//   https://www.geeksforgeeks.org/problems/find-the-closest-number5513/1


class Solution {

    public static int findClosest(int arr[], int n, int target) {

        int idx = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(arr[i] - target);
            if (min >= diff) {
                min = diff;
                idx = arr[i];
            }
        }

        return idx;
    }
}
