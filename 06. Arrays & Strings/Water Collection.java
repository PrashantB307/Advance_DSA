

//   https://practice.geeksforgeeks.org/problems/amount-of-water1348/1

//   https://www.codingninjas.com/studio/problems/trapping-rainwater_630519


class Solution {
    int maxWater(int arr[], int n) {
        
        int[] left = new int[n];
        for(int i = 0; i < n; i++){
            if(i == 0){
                left[i] = arr[i];
            }else{
                left[i] = Math.min(arr[i], left[i - 1]);
            }
        }

        int[] right = new int[n];
        for(int i = n - 1; i >= 0; i--){
            if(i == n - 1){
                left[i] = arr[n - 1];
            }else{
                left[i] = Math.min(arr[i], left[i + 1]);
            }
        }

        int val = 0;
        for(int i = 0; i < n; i++){
            val += Math.min(left[i], right[i]) - arr[i];
        }

        return val;
    }
}