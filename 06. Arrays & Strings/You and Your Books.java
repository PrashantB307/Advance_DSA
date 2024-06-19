

//    https://www.geeksforgeeks.org/problems/you-and-your-books/1


class Solution {
    long max_Books(int arr[], int n, int k) {
        
        long max = 0;
        long sum = 0;
        for(int val : arr){
            if(val <= k){
                sum += val;
            }else{
                max = Math.max(max, sum);
                sum = 0;
            }
        } 

        max = Math.max(max, sum);

        return max;
    }
}