

//   https://leetcode.com/problems/smallest-integer-divisible-by-k/

//   https://www.codingninjas.com/studio/problems/smallest-number-divisible-by-k_1467106


class Solution {
    public int smallestRepunitDivByK(int k) {
        
        if(k % 2 == 0 || k % 5 == 0){
            return -1;
        }

        int preRem = 0;
        for(int i = 1; i <= k; i++){
            preRem = (preRem * 10 + 1) % k;

            if(preRem == 0){
                return i;
            }
        }

        return -1;
    }
}