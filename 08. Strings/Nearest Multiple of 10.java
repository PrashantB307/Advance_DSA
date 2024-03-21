

//   https://www.geeksforgeeks.org/problems/nearest-multiple-of-102437/1


class Solution {

    String roundToNearest(String N) {

        int rem = N.charAt(N.length() - 1) - '0';
        if (rem > 5)
            rem = 10 - rem;
        else
            rem *= -1;

        return add(N, rem);
    }

    private static String add(String s, int rem) {
        int n = s.length();

        StringBuilder ans = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            rem += (s.charAt(i) - '0');
            ans.insert(0, rem % 10);
            rem /= 10;
        }

        if (rem != 0)
            ans.insert(0, rem);

        return ans.toString();

    }

}