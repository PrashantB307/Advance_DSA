

//    https://www.geeksforgeeks.org/problems/nth-fibonacci-number1335/1

//    https://leetcode.com/problems/fibonacci-number/submissions/1136934041/


class Solution {
    static int nthFibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        
        int f = 1;
        int s = 1;
        int mod = 1000000007;
        
        for(int i = 3; i <= n; i++){
            int t = f + s;
            f = s;
            s = t % mod;
        }
        
        return s;
    }
}