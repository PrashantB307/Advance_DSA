

//   https://www.geeksforgeeks.org/problems/maximum-length--170647/1


class Solution {
    int solve(int a, int b, int c) {

        int lar, sLar, tLar; // Lar -> largest, sLar -> Snd Largest, tLar -> Trd Largest

        if (a >= b && a >= c) {
            lar = a;

            if (b >= c) {
                sLar = b;
                tLar = c;
            } else {
                sLar = c;
                tLar = b;
            }
        } else if (b >= a && b >= c) {
            lar = b;

            if (a >= c) {
                sLar = a;
                tLar = c;
            } else {
                sLar = c;
                tLar = a;
            }
        } else {
            lar = c;

            if (a >= b) {
                sLar = a;
                tLar = b;
            } else {
                sLar = b;
                tLar = a;
            }
        }

        if (lar <= 2 * (sLar + tLar + 1)){
            return a + b + c;
        }else{
            return -1;
        }
    }
};