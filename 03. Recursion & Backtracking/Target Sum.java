

//   https://www.geeksforgeeks.org/problems/target-sum-1626326450/1


class Solution {
    static int findTargetSumWays(int n, int[] a, int tar) {
      
        return find(n - 1, a, tar);
    }

    static int find(int n, int[] arr, int tar) {
        if (n == -1){
            return tar == 0 ? 1 : 0;
        }
           
        return find(n - 1, arr, tar - arr[n]) + find(n - 1, arr, tar + arr[n]);
    }
};