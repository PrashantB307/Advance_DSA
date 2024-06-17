

//    https://www.geeksforgeeks.org/problems/count-numbers-containing-43022/1


class Solution {
    public static int countNumberswith4(int n) {
        int cnt = 0;

        for (int i = 0; i <= n; i++) {
            String str = Integer.toString(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '4') {
                    cnt++;
                    break;
                }
            }
        }

        return cnt;
    }
}