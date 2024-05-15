

//   https://www.geeksforgeeks.org/problems/three-great-candidates0515/1


class Solution {
    long maxProduct(int[] arr, int n) {
        if (n < 3) {
            return -1;
        }

        long max = Long.MIN_VALUE;
        long secmax = Long.MIN_VALUE;
        long thrdmax = Long.MIN_VALUE;

        long min = Long.MAX_VALUE;
        long secmin = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                thrdmax = secmax;
                secmax = max;
                max = arr[i];
            }else if (arr[i] > secmax) {
                thrdmax = secmax;
                secmax = arr[i];
            }else if (arr[i] > thrdmax) {
                thrdmax = arr[i];
            }

            if (arr[i] < min) {
                secmin = min;
                min = arr[i];
            }else if (arr[i] < secmin) {
                secmin = arr[i];
            }
        }

        return Math.max(min * secmin * max, thrdmax * secmax * max);
    }
}