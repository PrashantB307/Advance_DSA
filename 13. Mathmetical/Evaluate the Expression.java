

//   https://www.geeksforgeeks.org/problems/evaluate-the-expression0307/1


class Solution {
    public int evaluate_exp(int n) {

        if (n == 1) {
            return -1;
        }

        int a = 1;
        int b = 1;
        int c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            if (n == i) {
                break;
            }

            a = b;
            b = c;

        }

        return (a * c - b * b);
    }

}