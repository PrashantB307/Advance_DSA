

//    https://www.geeksforgeeks.org/problems/smith-number4132/1


class Solution {
    static int smithNum(int n) {
        if(isPrime(n) == true){
            return 0;
        }

        int sum1 = digitSum(n);
        int sum2 = 0;

        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                int s = digitSum(i);
                while (n > 0 && n % i == 0) {
                    sum2 += s;
                    n = n / i;
                }
            }
        }

        if(sum1 == sum2){
            return 1;
        }

        return 0;
    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    static int digitSum(int n){
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }
};