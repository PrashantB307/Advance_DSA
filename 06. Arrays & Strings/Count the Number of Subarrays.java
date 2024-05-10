

//   https://www.geeksforgeeks.org/problems/count-the-number-of-subarrays/1


class Solution {
    long countSubarray(int n, int A[], long L, long R) {
       
        long range1 = helper(n, A, R);
        long range2 = helper(n, A, L - 1);

        return range1 - range2;
    }

    long helper(int n, int[] A, long range){
        long sum = 0;
        int i = 0, j = 0;
        long cnt = 0;

        for(i = 0; i < n; i++){
            sum += A[i];

            while(sum > range){
               sum -= A[j];
               j++;
            }

            cnt += (i - j + 1);
        }

        return cnt;
    }
}