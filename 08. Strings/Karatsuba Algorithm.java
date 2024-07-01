

//   https://www.geeksforgeeks.org/problems/karatsuba-algorithm0135/1


class Solution {
    static Long karatsubaAlgo(String A, String B) {
        
        long v1 = Long.parseLong(A, 2);
        long v2 = Long.parseLong(B, 2);

        return v1 * v2;
    }
};