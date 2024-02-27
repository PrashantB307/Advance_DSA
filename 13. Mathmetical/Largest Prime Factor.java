

//    https://www.geeksforgeeks.org/problems/largest-prime-factor2601/1

//    https://www.codingninjas.com/studio/problems/largest-prime-factor_1062687


class Solution{
    static long largestPrimeFactor(int N) {
        
        int max = Integer.MIN_VALUE;
        while (N % 2 == 0) {
            N = N / 2;
            max = 2;
        }

        for(int i = 3; i <= Math.sqrt(N); i += 2){
            while (N % i == 0) {
                N = N / i;
                max = i;
            }
        }

        if(N > 2){
            max = N;
        }

        return max;
    }
}