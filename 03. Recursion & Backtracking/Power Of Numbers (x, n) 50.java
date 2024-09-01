

//   https://leetcode.com/problems/powx-n/

//   https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1


class Solution {
    public double myPow(double x, int n) {
        
        if(n == 0){
            return 1.0;
        }else if(n == 1){
            return x;
        }

        return helper(x, (long) n);
    }

    public double helper(double x, long n){
        if(n == 0){
            return 1;
        }

        if(n < 0){
            return 1.0 / helper(x, -n);
        }

        if(n % 2 == 0){
            double val = helper(x, n / 2);
            return val * val;
        }else{
            double val = helper(x, n - 1);
            return val * x;
        }
    }
}