

//   https://www.geeksforgeeks.org/problems/sum-of-products5049/1


class Solution {
    static long pairAndSum(int n, long arr[]) {
        long sum = 0;

        for(int i = 0; i < 32; i++){
            long k = 0;
            for(int j = 0; j < n; j++){
                if((arr[j] & (1 << i)) != 0){
                    k++;
                }
            }

            sum += (1 << i) * ((k) * (k - 1)) / 2; 
        }

        return sum;
    }
}