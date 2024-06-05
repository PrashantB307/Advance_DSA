

//    https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/


class Solution {
    public boolean checkZeroOnes(String s) {
        
        int ones = 0;
        int oMax = 0;
        int zeros = 0;
        int zMax = 0;
        for(char ch : s.toCharArray()){
            if(ch == '0'){
                zeros++;
                zMax = Math.max(zMax, zeros);
                ones = 0;
            }else{
                ones++;
                oMax = Math.max(oMax, ones);
                zeros = 0;
            }
        }

        return oMax > zMax ? true : false;
    }
}