

//   https://leetcode.com/problems/sum-of-two-integers/

//   https://www.geeksforgeeks.org/problems/sum-of-two-numbers-without-using-arithmetic-operators/1


class Solution {
    public int getSum(int a, int b) {
        
        int sum = a ^ b;
        int carry = a & b;

        if(carry == 0){
            return sum;
        }

        return getSum(sum, carry << 1);
    }
}