

//    https://www.geeksforgeeks.org/problems/maximum-product-subset-of-an-array/1


class Solution {
    public static int findMaxProduct(int n, int[] arr) {
       
        int mod = 1000000007;
        if (n == 1){
            return arr[0];
        }
            
        long max = 1;
        int neg = 0;
        int zero = 0;
        long neg_max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zero++;
                continue;
            }else if (arr[i] < 0) {
                neg_max = Math.max(neg_max, arr[i]);
                neg++;
            }

            max = (max * arr[i]) % mod;
        }

        if (zero == n)
            return 0;
        if (neg == 1 && neg + zero == n)
            return 0;
        if (neg % 2 == 1)
            max = max / neg_max;

        return (int) max;
    }
}