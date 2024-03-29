

//   https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1


class Solution {
    public static long[] productExceptSelf(int nums[], int n) {
        
        long left[] = new long[n];
        long right[] = new long[n];

        left[0] = 1;
        right[n - 1] = 1;

        // left to right
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // for right to left
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        
        for (int i = 0; i < n; i++) {
            left[i] = left[i] * right[i];
        }
        
        return left;
    }
}