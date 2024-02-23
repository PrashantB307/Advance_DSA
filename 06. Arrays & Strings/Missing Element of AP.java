

//   https://www.geeksforgeeks.org/problems/missing-element-of-ap2228/1

//   https://www.codingninjas.com/studio/problems/missing-number-in-ap_975498


class Solution {
    int findMissing(int[] arr, int n) {
         int min = 0;
         if(n == 2){
             return (arr[0] + arr[1]) / 2;
         }
        for(int i = 2; i < n;){
            int n1 = arr[i] - arr[i - 1];
            int n2 = arr[i - 1] - arr[i - 2];

            min = Math.min(n1, n2);
            break; 
        }

        for(int i = 1; i < n; i++){
            int next = arr[i - 1] + min;
            if(next != arr[i]){
                return next;
            }
        }
        return 0;
    }
}