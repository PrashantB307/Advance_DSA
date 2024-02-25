

//    https://practice.geeksforgeeks.org/problems/swapping-pairs-make-sum-equal4142/1


import java.util.*;
class Solution
{
    long findSwapValues(long A[], int n, long  B[], int m){
        Arrays.sort(A);
        Arrays.sort(B);

        long sum1 = 0, sum2 = 0;
        for(long val : A){
            sum1 += val;
        }

        for(long val : B){
            sum2 += val;
        }

        if(sum1 == sum2){
            return 1;
        }

        int i = 0; 
        int j = 0;

        while(i < n && j < m){
            long s1 = sum1 - A[i] + B[j];
            long s2 = sum2 - B[j] + A[i];

            if(s1 == s2){
                return 1;
            }else if(s1 < s2){
                j++;
            }else{
                i++;
            }
        }

        return -1;
    }
}
