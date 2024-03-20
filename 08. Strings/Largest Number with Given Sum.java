

//   https://www.geeksforgeeks.org/problems/largest-number-with-given-sum-1587115620/1


class Solution {
    static String largestNumber(int n, int sum) {
        if ((n * 9) < sum) {
            return "-1";
        }

        String res = "";

        while (sum != 0) {
            if (sum > 9) {
                res += '9';
                sum -= 9;
                n--;
            } else {
                char temp = (char) (sum + '0');
                res += temp;
                sum = 0;
                n--;
            }
        }

        while (n != 0) {
            res += '0';
            n--;
        }

        return res;

    }
}