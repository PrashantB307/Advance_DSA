

//    https://www.geeksforgeeks.org/problems/minimum-integer--170647/1


class Solution {
    public static int minimumInteger(int n, int[] arr) {
        
        long sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i : arr){
            sum += i;
        }

        for(int i = 0; i < n; i++){
            long val = (long)arr[i] * (long)n;
            if(val >= sum){
                min = Math.min(arr[i], min);
            }
        }

        if(min == Integer.MAX_VALUE){
            return -1;
        }

        return min;
    }
}