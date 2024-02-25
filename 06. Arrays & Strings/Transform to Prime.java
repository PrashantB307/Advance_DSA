

//   https://www.geeksforgeeks.org/problems/transform-to-prime4635/1


class Solution
{
    public int minNumber(int arr[], int N)
    {
        int sum = 0;
        for(int val : arr){
            sum += val;
        }
        
        if(isPrime(sum) == true){
            return 0;
        }
        
        for(int i = 0; ; i++){
            if(isPrime(sum + i)){
                return i;
            }
        }
    }
    
    boolean isPrime(int N){
        if (N <= 1)
            return false;
        else if (N == 2)  // Check if number is 2
            return true;
        else if (N % 2 == 0)  // Check if n is a multiple of 2
            return false;
 
        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(N); i += 2) {
            if (N % i == 0)
                return false;
        }
        return true;
    }
}
