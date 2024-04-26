

//   https://www.geeksforgeeks.org/problems/variation-in-nim-game4317/1


class Solution{
    static int findWinner(int n, int A[]){
        int res = 0;
        for(int val : A){
            res ^= val; 
        }
        
        if(res == 0){
            return 1;
        }
        
        if(n % 2 == 0){
            return 1;
        }else{
            return 2;
        }
    }
}