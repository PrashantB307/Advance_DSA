

//   https://www.geeksforgeeks.org/problems/mapped-string0501/1


class Solution {
    static long mapStr(long N) {
        long mod = 1000000007;
        long ans = 1;
        
        for(int i = 1; i <= N; i++){
            ans = (ans * i) % mod;
        }
        
        return ans % mod;
        
    }
}