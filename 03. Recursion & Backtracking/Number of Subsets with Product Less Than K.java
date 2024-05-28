

//    https://www.geeksforgeeks.org/problems/number-of-subsets-with-product-less-than-k/1


class Solution {

    static int numOfSubsets(int[] nums, int N, int K) {
        return helper(nums, N, K, 1, 0) - 1;
    }

    static int helper(int arr[], int N, int K, int prod, int i) {

        if (prod > K) {
            return 0;
        }

        if (i == N) {
            return 1;
        }

        int cnt = 0;

        cnt += (helper(arr, N, K, prod * arr[i], i + 1) + helper(arr, N, K, prod, i + 1));

        return cnt;
    }
}