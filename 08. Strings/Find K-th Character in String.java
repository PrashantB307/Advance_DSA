

//   https://www.geeksforgeeks.org/problems/find-k-th-character-in-string3841/1


class Solution {
    char kthCharacter(int m, int n, int k) {

        StringBuilder res = new StringBuilder(Integer.toBinaryString(m));

        while (n > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < res.length(); i++) {
                if (res.charAt(i) == '0') {
                    sb.append("01");
                } else {
                    sb.append("10");
                }
            }

            res = sb;

            n--;
        }

        return res.charAt(k - 1);

    }
}