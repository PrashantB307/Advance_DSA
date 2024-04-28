

//    https://www.geeksforgeeks.org/problems/rightmost-different-bit-1587115621/1


class Solution
{
    public static int posOfRightMostDiffBit(int m, int n)
    {
        int xor = m ^ n;
        int cnt = 0;
        
        while(xor > 0){
            cnt++;
            if((xor & 1) == 1){
                return cnt;
            }
            
            xor = xor / 2;
        }
        
        return -1;
    }
}
