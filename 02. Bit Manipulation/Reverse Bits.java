

//   https://www.geeksforgeeks.org/problems/reverse-bits3556/1

//   https://www.naukri.com/code360/problems/reverse-bits_2181102


class Solution {
    static Long reversedBits(Long x) {
        
        long ans = 0;
        long i = 31;

        while (x != 0) {
            ans += (long)Math.pow(2, i) * (x & 1);
            x = x >> 1;
            i--;
        }

        return ans;
    }
};