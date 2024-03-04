

//   https://www.geeksforgeeks.org/problems/transform-to-prime4635/1


class Solution
{
    public int minNumber(int arr[], int N)
    {
        int sum = 0;
        for(int val : arr){
            sum += val;
        }
        
        if(isPrime(sum)){
            return 0;
        }
        
        int prev = sum;
        while(!isPrime(sum)){
            sum++;
        }
        
        return sum - prev;

    }
    
    boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}