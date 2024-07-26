

//   https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/


class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int n = arr.length;
        int sum = 0, cnt = 0;

        int i = 0, j = 0;
        for (i = 0; i < k; i++) {
            sum += arr[i];
        }

        int avg = sum / k;
        if (avg >= threshold) {
            cnt++;
        }

        while (i < n) {

            sum += (arr[i] - arr[j]);

            avg = sum / k;
            if (avg >= threshold) {
                cnt++;
            }

            i++;
            j++;
        }

        return cnt;
    }
}