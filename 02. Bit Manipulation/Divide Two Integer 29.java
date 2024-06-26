

//  https://leetcode.com/problems/divide-two-integers/

//  https://www.geeksforgeeks.org/problems/division-without-using-multiplication-division-and-mod-operator/0

//  https://www.codingninjas.com/studio/problems/-divide-two-integers_1112617


class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE; 
         
        boolean negative = dividend < 0 ^ divisor < 0; 
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int quotient = 0, subQuot = 0;
        
        while (dividend - divisor >= 0) {
            for (subQuot = 0; dividend - (divisor << subQuot << 1) >= 0; subQuot++);
            quotient += 1 << subQuot; 
            dividend -= divisor << subQuot; 
        }

        return negative ? -quotient : quotient;
    }
}