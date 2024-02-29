

//   https://www.geeksforgeeks.org/problems/product-of-primes5328/1


class Solution{
    static long primeProduct(long L, long R){
        
        long prod = 1;
        long mod = 1000000007;

        for(long i = L; i <= R; i++){
            if(isPrime(i)){
                prod = (prod * i) % mod;
            }
        }

        return prod % mod;
    }

    static boolean isPrime(long a) {
        if (a < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    }
}