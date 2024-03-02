

//   https://leetcode.com/problems/sum-of-square-numbers/description/


class Solution {
    public boolean judgeSquareSum(int c) {
        
        long n = (long)Math.sqrt(c);
        long i = 0;
        long j = n;

        while (i <= n) {
    
            long sum = i * i + j * j;
            
            if(sum < c){
                i++;
            }else if(sum > c){
                j--;
            }else{
                return true;
            }
        }


        return false;
    }
}