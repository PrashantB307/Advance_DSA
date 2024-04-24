

//   https://practice.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1

//   https://www.codingninjas.com/studio/problems/check-whether-k-th-bit-is-set-or-not_5026446


class CheckBit{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
       int bit = (n & (1 << k)) == 0 ? 0 : 1;
       
       if(bit == 1){
           return true;
       }else{
           return false;
       }
    }
    
}