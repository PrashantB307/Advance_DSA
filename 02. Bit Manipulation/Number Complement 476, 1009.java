

//   https://leetcode.com/problems/number-complement/

//   https://leetcode.com/problems/complement-of-base-10-integer/


class Solution {
    public int findComplement(int num) {
        int len = Integer.toBinaryString(num).length();
        int comp = (1 << len) - 1;

        return (num ^ comp);
    }
}