

//   https://www.geeksforgeeks.org/problems/type-it--170645/1

class Solution {
    int minOperation(String s) {
        int n = s.length();
        int k = 0;

        for (int i = n / 2 - 1; i >= 0; i--) {
            if (s.substring(i + 1, 2 * i + 2).equals(s.substring(0, i + 1))) {
                k = i;
                break;
            }
        }

        return n - k;
    }
}