

//    https://www.geeksforgeeks.org/problems/techfest-and-the-queue1044/1


class Solution {
    public static long sumOfPowers(long a, long b) {
       long ans = 0;
       for(long i = a; i <= b; i++){
        ans += cntFact(i);
       }

       return ans;
    }

    static long cntFact(long n){
        long cnt = 0;
        for(long  i = 2; i * i <= n; i++){
            while (n % i == 0) {
                cnt++;
                n = n / i;
            }
        }

        if(n != 1){
            cnt++;
        }

        return cnt;
    }
}