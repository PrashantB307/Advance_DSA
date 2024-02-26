

//   https://www.geeksforgeeks.org/problems/composite-and-prime0359/1


class Solution
{
    public int Count(int L, int R)
    {
        int composites = 0;
        int primes = 0;
        
        for (int i = L; i <= R; i++) {
            if (isComposite(i)) {
                composites++;
            } else if (isPrime(i)) {
                primes++;
            }
        }
        
        return composites - primes;
    }
    
    public boolean isComposite(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not considered composite
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true; // If it has a divisor other than 1 and itself, it's composite
            }
        }

        return false;
    }

    boolean isPrime(int n){
        if(n < 2){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}