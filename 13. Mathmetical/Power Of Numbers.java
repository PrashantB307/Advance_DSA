

//   https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1

//   https://www.naukri.com/code360/problems/find-power-of-a-number_893198


class Solution
{
        
    long power(int N,int R)
    {
        long mod = 1000000007;
        
        if(R == 1){
            return N;
        }
        if(R == 0){
            return 1;
        }
        
        if(R % 2 == 0){
            long val = power(N, R / 2);
            return (val * val) % mod;
        }else{
            long val = power(N, R - 1);
            return (val * N) % mod;
        }
        
    }

}
