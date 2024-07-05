

//    https://www.geeksforgeeks.org/problems/summed-matrix5834/1

//    https://www.naukri.com/code360/problems/summed-matrix_981304


class Solution {
    static long sumMatrix(long n, long q) {

        if (q > 2 * n) {   
            return 0;
        }
        
        long cnt = 0;
        if (q <= n) {
            cnt = q - 1;
        }
        else {
            cnt = 2 * n - q + 1;
        }
        
        return cnt;
    }
}