

//   https://www.geeksforgeeks.org/problems/game-of-xor1541/1


class Solution {
    static int gameOfXor(int N , int[] A) {
       if(N % 2 == 0){
           return 0;
       }
       
       int xor = A[0];
       for(int i = 2; i < N; i += 2){
           xor = xor ^ A[i];
       }
       
       return xor;
    }
};