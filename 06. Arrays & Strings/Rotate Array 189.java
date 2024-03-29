

//   https://leetcode.com/problems/rotate-array/description/

//   https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1


class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public void reverse(int[] arr, int l, int r){
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}

// XXXXXXXXXXXXXXXXXXXXXXXX=======>    GFG     <=======XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2{
    static void rotateArr(int nums[], int k, int n)
    {
        k = k % n;

        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public static void reverse(int[] arr, int l, int r){
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}