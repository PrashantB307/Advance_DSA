

//   https://www.geeksforgeeks.org/problems/rohans-love-for-matrix4723/1


class Solution {
    static int firstElement(int n) {
        int mod = 1000000007;
        if(n == 1 || n == 2){
            return 1;
        }

        int a = 1, b = 1;
        int ans = 0;

        for(int i = 3; i <= n; i++){
            ans = (a + b) % mod;
            a = b;
            b = ans;
        }

        return ans;
    }
}