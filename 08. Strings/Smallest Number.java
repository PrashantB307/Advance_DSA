

//   https://www.geeksforgeeks.org/problems/smallest-number5829/1


class Solution {
    public String smallestNumber(int s, int d) {
        
        if (s > 9 * d) {
            return "-1";
        }

        int[] digits = new int[d];

        for (int i = d - 1; i >= 0; i--) {
            if (s > 9) {
                digits[i] = 9;
                s -= 9;
            } else {
                digits[i] = s;
                s = 0;
            }
        }
        
        if (digits[0] == 0) {
            digits[0] = 1;
            for (int i = 1; i < d; i++) {
                if (digits[i] > 0) {
                    digits[i] -= 1;
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }

        return sb.toString();
    }
}