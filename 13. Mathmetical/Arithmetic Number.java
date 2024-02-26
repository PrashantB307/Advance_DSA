

//   https://www.geeksforgeeks.org/problems/arithmetic-number2815/1


class Solution{
    static int inSequence(int A, int B, int C){
       
       if(C == 0){
           if(A == B){
               return 1;
           }else{
               return 0;
           }
       }else{
           if((B - A) % C == 0 && (B - A) / C >= 0){
               return 1;
           }else{
               return 0;
           }
       }
       
       
    }
}