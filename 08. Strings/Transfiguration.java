

//   https://www.geeksforgeeks.org/problems/transfiguration--141631/1


class Solution {
    int transfigure(String A, String B) {
        int m = A.length() - 1;
        int n = B.length() - 1;

        if (m != n) {
            return -1;
        }

        char[] arr1 = A.toCharArray();
        char[] arr2 = B.toCharArray();

        int sum = 0;
        for (int i = 0; i < m + 1; i++) {
            sum += arr1[i];
            sum -= arr2[i];
        }

        if (sum != 0){
            return -1;
        }

        int cnt = 0;
        while (m >= 0 && n >= 0) {
            if (A.charAt(m) == B.charAt(n)) {
                m--;
                n--;
            } else {
                m--;
                cnt++;
            }
        }

        if (cnt == A.length()) {
            return -1;
        }

        return cnt;
    }
}