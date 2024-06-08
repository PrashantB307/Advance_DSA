

//  https://leetcode.com/problems/sum-of-digits-of-string-after-convert/


class Solution {
    public int getLucky(String s, int k) {

        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int n = ch - 'a' + 1;
            sb.append(n);
        }

        String str = sb.toString();
        int sum = 0;
        while (k > 0) {
            sum = 0;
            for (char ch : str.toCharArray()) {
                sum += ch - '0';
            }

            str = String.valueOf(sum);
            k--;
        }

        return sum;
    }
}