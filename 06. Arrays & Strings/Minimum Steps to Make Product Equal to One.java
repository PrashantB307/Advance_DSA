

//    https://www.geeksforgeeks.org/problems/minimum-steps-to-make-product-equal-to-one/1


class Solution {
    static int makeProductOne(int[] arr, int N) {
        int sum = 0;
        int zeroes = 0;
        int prod = 1;
        
        for (int i : arr) {
            if (i < 0) {
                prod *= -1;
            }

            sum += Math.abs(Math.abs(i) - 1);

            if (i == 0) {
                zeroes++;
            }
        }

        if (prod < 0 && zeroes == 0) {
            sum += 2;
        }

        return sum;

    }
};