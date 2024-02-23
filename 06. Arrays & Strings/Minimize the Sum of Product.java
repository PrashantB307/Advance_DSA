

//    https://practice.geeksforgeeks.org/problems/minimize-the-sum-of-product1525/1


import java.util.*;
class Solution {

    public long minValue(long a[], long b[], long n) 
    {
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = (int)n - 1;

        long sum = 0;
        while (i < n && j >= 0) {
            long mul = a[i] * b[j];
            sum += mul;
            i++;
            j--;
        }

        return sum;
    
    }
}