

//   https://www.geeksforgeeks.org/problems/check-if-the-number-is-balanced3014/1


class Sol {
    Boolean balancedNumber(String s) {
        int n = s.length();
        int mid = n / 2;

        String str1 = s.substring(0, mid);
        String str2 = s.substring(mid + 1);

        int sum1 = 0;
        for (char ch : str1.toCharArray()) {
            sum1 = sum1 + ch - '0';
        }

        for (char ch : str2.toCharArray()) {
            sum1 = sum1 - (ch - '0');
        }

        return sum1 == 0;
    }
}