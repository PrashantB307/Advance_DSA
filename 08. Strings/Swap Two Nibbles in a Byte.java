

//   https://www.geeksforgeeks.org/problems/swap-two-nibbles-in-a-byte0446/1


class Solution {
    static int swapNibbles(int n) {

        String s = Integer.toBinaryString(n);
        String str = "";

        if (s.length() < 8) {
            int len = 8 - s.length();
            for (int i = 0; i < len; i++) {
                str += '0';
            }
        }

        s = str + s;
        String ans = s.substring(4) + s.substring(0, 4);

        return Integer.parseInt(ans, 2);
    }
}