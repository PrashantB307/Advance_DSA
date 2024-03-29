

//   https://www.geeksforgeeks.org/problems/number-and-the-digit-sum4021/1


class Sol
{
    public static long numberCount (long N, long K)
    {
        int cnt = 0;
        for(int i = 10; i <= N; i++){
          
            if((i - getSum(i)) >= K){
                cnt++;
            }
        }

        return cnt;
    }

    static long getSum(long n){

        long  sum = 0;
        while (n != 0) {
            long rem = n % 10;
            sum += rem;
            n = n / 10;
        }

        return sum;
    }

}