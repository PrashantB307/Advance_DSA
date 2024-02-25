

//   https://www.geeksforgeeks.org/problems/split-array-largest-sum--141634/1


class Solution {
    static int splitArray(int[] arr, int N, int k) {
        int low = 0;
        int high = 0;

        for (int i = 0; i < N; i++) {
            high += arr[i];
            low = Math.max(low, arr[i] - 1);
        }

        while (low < high - 1) {
            int mid = low + (high - low) / 2;

            if(check(arr, mid, N, k) == true){
                high = mid;
            }else{
                low = mid;
            }
        }

        return high;
    }

    static boolean check(int[] arr, int mid, int n, int k){
        int sum = 0;
        int cuts = 0;

        for(int i = 0; i < n; i++){
            if(sum + arr[i] > mid){
                cuts++;
                sum = arr[i];
            }else{
                sum += arr[i];
            }
        }

        return cuts < k;
    }
};